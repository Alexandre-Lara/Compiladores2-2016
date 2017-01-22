/*
 * Created on 27-feb-2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

package com.welsungo.math.integral;

import org.nfunk.jep.JEP;

/**
 * @author felipe
 * 
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class DefnIntegral {

	//private Evaluator mEvaluator;
	private String mFunction;
	private double mDesde;
	private double mHasta;

	private double mNumIntervalos;

	/** Parser */
	private JEP myParser;
	
	/** Current xValue */
	private double xValue;
	/* GUI components */
	//private String mFunction;
	private String mError;
	private String mResult;
	
	public DefnIntegral() {
		myParser = new JEP();
		myParser.initFunTab(); // clear the contents of the function table
		myParser.addStandardFunctions();
		myParser.setTraverse(true);
	}
	
	public void parseExpression(String pFunction) {
		myParser.initSymTab(); // clear the contents of the symbol table
		myParser.addStandardConstants();
		myParser.addComplex(); // among other things adds i to the symbol table
		myParser.addVariable("x", xValue);
		myParser.setImplicitMul(true);
		myParser.parseExpression(pFunction);
	}
	
	public void updateResult() {
		System.out.println("updateResult");
		Object result = myParser.getValueAsObject();
		String errorInfo = myParser.getErrorInfo(); 

		//Is the result ok?
		if (result != null) {
			setResult(result.toString());
		} else {
			setResult("");
		}
		
		System.out.println("   errorInfo = ["+errorInfo+"]");
		
		// Get the error information
		if (errorInfo != null) {
			setError(errorInfo);
		} else {
			setError("");
		}
	}
	
	/**
	 * @return Returns the desde.
	 */
	public double getDesde() {
		return mDesde;
	}

	/**
	 * @param desde
	 *           The desde to set.
	 */
	public void setDesde(double desde) {
		mDesde = desde;
	}

	/**
	 * @return Returns the function.
	 */
	public String getFunction() {
		return mFunction;
	}

	/**
	 * @param function
	 *           The function to set.
	 */
	public void setFunction(String function) {
		mFunction = function;
	}

	/**
	 * @return Returns the hasta.
	 */
	public double getHasta() {
		return mHasta;
	}

	/**
	 * @param hasta
	 *           The hasta to set.
	 */
	public void setHasta(double hasta) {
		mHasta = hasta;
	}

	/**
	 * @return Returns the intervalo.
	 */
	public double getNumIntervalos() {
		return mNumIntervalos;
	}

	/**
	 * @param intervalo
	 *           The intervalo to set.
	 */
	public void setNumIntervalos(double pNumIntervalos) {
		mNumIntervalos = pNumIntervalos;
	}

	/**
	 *  
	 */
	public double getIntegral() {
		// TODO
		double sizeIntervalo = (mHasta - mDesde) / mNumIntervalos;
		
		System.out.println("sizeIntervalo="+sizeIntervalo);
		
		double aux = mDesde;
		double dblIntegral = 0;

		while (aux < mHasta) {
			//dblInt = dblInt + valor de la funcion
			this.setXValue(aux);
			//this.parseExpression(mEvaluator.getFunction());
			this.parseExpression(this.getFunction());
			this.updateResult();

			String strRes = this.getResult();
			double dblRes = 0;
			try {
				dblRes = Double.parseDouble(strRes.trim()); 
			} catch (NumberFormatException e){e.printStackTrace();}
			
			System.out.println("f(x="+aux+") = "+dblRes);
			
			dblIntegral = dblIntegral + dblRes;
			aux = aux + sizeIntervalo;
		}
		
		//Compute Integral
		//Valor de la funcion en mDesde
		this.setXValue(mDesde);
		//this.parseExpression(mEvaluator.getFunction());
		this.parseExpression(this.getFunction());
		this.updateResult();
		String strDesde = this.getResult();
		double dblDesde = 0;
		try {
			dblDesde = Double.parseDouble(strDesde.trim()); 
		} catch (NumberFormatException e){e.printStackTrace();}
		
		System.out.println("f(x="+mDesde+") = "+dblDesde);
		
		//Valor de la funcion en mHasta
		this.setXValue(mHasta);
		//this.parseExpression(mEvaluator.getFunction());
		this.parseExpression(this.getFunction());
		this.updateResult();
		String strHasta = this.getResult();
		double dblHasta = 0;
		try {
			dblHasta = Double.parseDouble(strHasta.trim()); 
		} catch (NumberFormatException e){e.printStackTrace();}
		
		System.out.println("f(x="+mHasta+") = "+dblHasta);
		
		dblIntegral = (dblIntegral-(dblDesde+dblHasta)/2)* sizeIntervalo;
		
		/*
		 * for(double i=mDesde; i <mHasta; i+sizeIntervalo) { }
		 */

		return dblIntegral;
	}
	
	/**
	 * @return Returns the error.
	 */
	public String getError() {
		return mError;
	}
	/**
	 * @param pError The error to set.
	 */
	public void setError(String pError) {
		mError = pError;
	}
	/**
	 * @return Returns the result.
	 */
	public String getResult() {
		return mResult;
	}
	/**
	 * @param pResult The result to set.
	 */
	public void setResult(String pResult) {
		mResult = pResult;
	}
	
	/**
	 * @return Returns the myParser.
	 */
	public JEP getMyParser() {
		return myParser;
	}
	/**
	 * @param pMyParser The myParser to set.
	 */
	public void setMyParser(JEP pMyParser) {
		myParser = pMyParser;
	}
	/**
	 * @return Returns the xValue.
	 */
	public double getXValue() {
		return xValue;
	}
	/**
	 * @param pValue The xValue to set.
	 */
	public void setXValue(double pValue) {
		xValue = pValue;
	}
}