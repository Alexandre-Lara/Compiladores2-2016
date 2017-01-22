/*
 * Created on 02-mar-2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.welsungo.math.integral;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import org.nfunk.jep.JEP;

/**
 * @author felipe
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class DefnIntegralApplet extends Applet {

	private DefnIntegral defnInt;// = new DefnIntegral();
	private JEP myParser;
	private double xValue;

	private Label labFunction = null;
	private Label labDesde = null;
	private Label labHasta = null;
	private Label labNumIntervalos = null;
	private Label labResultado = null;
	private Label labError = null;
	private TextField txtFunction = null;	
	private TextField txtDesde = null;
	private TextField txtHasta = null;
	private TextField txtNumIntervalos = null;
	private TextField txtResultado = null;
	private Button btnCalcular = null;
	private TextArea txtAreaError = null;

	/**
	 * This is the default constructor
	 */
	public DefnIntegralApplet() {
		super();
		init();
	}
	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	public void init() {
		this.setLayout(null);
		this.add(getLabFunction(), null);
		this.add(getTxtFunction(), null);
		this.add(getLabDesde(), null);
		this.add(getLabHasta(), null);
		this.add(getLabNumIntervalos(), null);
		this.add(getLabResultado(), null);
		this.add(getLabError(), null);
		this.add(getTxtAreaError(), null);
		this.add(getTxtFunction(), null);
		this.add(getTxtDesde(), null);
		this.add(getTxtHasta(), null);
		this.add(getTxtNumIntervalos(), null);
		this.add(getTxtResultado(), null);
		this.add(labError, null);
		this.add(getBtnCalcular(), null);
		this.setBackground(new Color(154,169,194));
		this.setSize(370, 300);
		txtFunction.requestFocus();
		defnInt = new DefnIntegral();
	}
	
	
	/**
	 * @return Returns the btnCalcular.
	 */
	public Button getBtnCalcular() {
		if(btnCalcular == null) {
			btnCalcular = new Button();
			btnCalcular.setBounds(280, 74, 70, 22);
			btnCalcular.setName("btnCalcular");
			btnCalcular.setLabel("Calcular");
			btnCalcular.setVisible(true);
			btnCalcular.setEnabled(false);

			btnCalcular.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) {
					DefnIntegral defnInt = new DefnIntegral();
					
					double vDesde = 0D;
					try {
						vDesde = Double.parseDouble(txtDesde.getText().trim()); 
					} catch (NumberFormatException exc){}
					defnInt.setDesde(vDesde);
					
					double vHasta = 0D;
					try {
						vHasta = Double.parseDouble(txtHasta.getText().trim()); 
					} catch (NumberFormatException exc){}
					defnInt.setHasta(vHasta);
					
					double vNumIntervalos = 0D;
					try {
						vNumIntervalos = Double.parseDouble(txtNumIntervalos.getText().trim()); 
					} catch (NumberFormatException exc){}
					defnInt.setNumIntervalos(vNumIntervalos);
					
					defnInt.setFunction(txtFunction.getText());
					double dblInt = defnInt.getIntegral();
					System.out.println("integral="+dblInt);

					// 2 decimal places, rounded, locale-sensitive.
					String textResult = "";
					java.text.DecimalFormat df2 = new java.text.DecimalFormat("###,##0.00");
					textResult = df2.format(dblInt);
					txtResultado.setText(textResult);
					btnCalcular.setEnabled(false);
					
					/*
					// or exponential scientific format, locale-sensitive.
					java.text.DecimalFormat de = new java.text.DecimalFormat("0.0000000000E00");
					textResult = de.format(dblInt);
					
					// or best for readability, no loss of precision, locale-insensitive
					textResult = Double.toString(dblInt);
					
					// or best for maintainability, no loss of precision, locale-insensitive
					textResult = String.valueOf(dblInt);
					*/
				}
			});
		}
		return btnCalcular;
	}

	/**
	 * @return Returns the labDesde.
	 */
	public Label getLabDesde() {
		if(labDesde == null) {
			labDesde = new Label();
			labDesde.setBounds(15, 45, 53, 20);
			labDesde.setText("Desde:");
			labDesde.setVisible(true);
		}
		return labDesde;
	}

	/**
	 * @return Returns the labFunction.
	 */
	public Label getLabFunction() {
		if(labFunction == null) {
			labFunction = new Label();
			labFunction.setBounds(15, 15, 79, 20);
			labFunction.setText("Función f(x) =");
			labFunction.setVisible(true);
		}
		return labFunction;
	}

	/**
	 * @return Returns the labHasta.
	 */
	public Label getLabHasta() {
		if(labHasta == null) {
			labHasta = new Label();
			labHasta.setBounds(15, 75, 55, 20);
			labHasta.setText("Hasta:");
			labHasta.setVisible(true);
		}
		return labHasta;
	}

	/**
	 * @return Returns the labNumIntervalos.
	 */
	public Label getLabNumIntervalos() {
		if(labNumIntervalos == null) {
			labNumIntervalos = new Label();
			labNumIntervalos.setBounds(230, 45, 66, 20);
			labNumIntervalos.setText("Intervalos:");
			labNumIntervalos.setVisible(true);
		}
		return labNumIntervalos;
	}

	/**
	 * @return Returns the labResultado.
	 */
	public Label getLabResultado() {
		if(labResultado == null) {
			labResultado = new Label();
			labResultado.setBounds(15, 105, 70, 20);
			labResultado.setText("Resultado:");
			labResultado.setVisible(true);
		}
		return labResultado;
	}
	
	/**
	 * @return Returns the labError.
	 */
	public Label getLabError() {
		if(labError == null) {
			labError = new Label();
			labError.setBounds(15, 135, 70, 20);
			labError.setText("Errores:");
			labError.setVisible(true);
		}
		return labError;
	}

	/**
	 * @return Returns the txtDesde.
	 */
	public TextField getTxtDesde() {
		if(txtDesde == null) {
			txtDesde = new TextField();
			txtDesde.setBounds(100, 45, 40, 20);
			txtDesde.setEnabled(false);
			txtDesde.addKeyListener(new KeyListener() { 
				public void keyTyped(KeyEvent e) {
					char key = e.getKeyChar();
					System.out.println("key="+key);
					if((key >= '0' && key <= '9'))
						System.out.println("NUMERIC");
					else if (key == '\b') {
						System.out.println("BACKSPACE");
					} else if (key == '.') {
						System.out.println("COMA");
					} else {
						System.out.println("NO NUMERIC");
						e.setKeyChar((char)3);
					}
				}
				public void keyPressed(KeyEvent e) {} 
				public void keyReleased(KeyEvent e) {} 
			});
			txtDesde.addTextListener(
				new TextListener() {
					public void textValueChanged(TextEvent evt) {
						checkDataInput();
					}
				}
			);
		}
		return txtDesde;
	}

	/**
	 * @return Returns the txtFunction.
	 */
	public TextField getTxtFunction() {
		if(txtFunction == null) {
			txtFunction = new TextField();
			txtFunction.setBounds(100, 15, 250, 20);
			txtFunction.addTextListener(
				new TextListener() {
					public void textValueChanged(TextEvent evt) {
						txtFunctionValueChanged();
						checkDataInput();
					}
				}
			);
		}
		return txtFunction;
	}

	/**
	 * @return Returns the txtHasta.
	 */
	public TextField getTxtHasta() {
		if(txtHasta == null) {
			txtHasta = new TextField();
			txtHasta.setBounds(100, 75, 40, 20);
			txtHasta.setEnabled(false);
			txtHasta.addKeyListener(new KeyListener() { 
				public void keyTyped(KeyEvent e) {
					char key = e.getKeyChar();
					if((key >= '0' && key <= '9'))
						System.out.println("NUMERIC");
					else if (key == '\b') {
						System.out.println("BACKSPACE");
					} else if (key == '.') {
						System.out.println("COMA");
					} else {
						System.out.println("NO NUMERIC");
						e.setKeyChar((char)3);
					}
				}
				public void keyPressed(KeyEvent e) {} 
				public void keyReleased(KeyEvent e) {} 
			});
			txtHasta.addTextListener(
				new TextListener() {
					public void textValueChanged(TextEvent evt) {
						checkDataInput();
					}
				}
			);
		}
		return txtHasta;
	}

	/**
	 * @return Returns the txtNumIntervalos.
	 */
	public TextField getTxtNumIntervalos() {
		if(txtNumIntervalos == null) {
			txtNumIntervalos = new TextField();
			txtNumIntervalos.setBounds(300, 45, 50, 20);
			txtNumIntervalos.setEnabled(false);
			txtNumIntervalos.addTextListener(
				new TextListener() {
					public void textValueChanged(TextEvent evt) {
						//txtFieldValueChanged();
						checkDataInput();
					}
				}
			);
			txtNumIntervalos.addKeyListener(new KeyListener() { 
				public void keyTyped(KeyEvent e) {
					char key = e.getKeyChar();
					if((key >= '0' && key <= '9'))
						System.out.println("NUMERIC");
					else if (key == '\b') {
						System.out.println("BACKSPACE");
					} else {
						System.out.println("NO NUMERIC");
						e.setKeyChar((char)3);
					}
				}
				public void keyPressed(KeyEvent e) {} 
				public void keyReleased(KeyEvent e) {} 
			});
		}
		return txtNumIntervalos;
	}

	/**
	 * @return Returns the txtResultado.
	 */
	public TextField getTxtResultado() {
		if(txtResultado == null) {
			txtResultado = new TextField();
			txtResultado.setBounds(100, 105, 80, 20);
			txtResultado.setEnabled(false);
		}
		return txtResultado;
	}
	/**
	 * @param pTxtResultado The txtResultado to set.
	 */
	public void setTxtResultado(TextField pTxtResultado) {
		txtResultado = pTxtResultado;
	}
	/**
	 * This method initializes textArea	
	 * 	
	 * @return java.awt.TextArea	
	 */    
	private TextArea getTxtAreaError() {
		if(txtAreaError == null) {
			txtAreaError = new TextArea();
			txtAreaError.setBounds(100, 135, 250, 90);
			txtAreaError.setEnabled(false);
			txtAreaError.setEditable(false);
			txtAreaError.setBackground(Color.white);
		}
		return txtAreaError;
	}
	
	/**
	 * Whenever the expression is changed, this method is called.
	 * The expression is parsed, and the updateResult() method
	 * invoked.
	 */
	private void txtFunctionValueChanged() {
		System.out.println("txtFunctionValueChanged");
		defnInt.parseExpression(txtFunction.getText());

		defnInt.updateResult();

		String vError = defnInt.getError();
		txtAreaError.setText(vError);

		System.out.println("   Error= ["+vError+"]");

		//Si no hay error
		if(vError.equals("")) {
			//System.out.println("   equals");
			enableInputFields();	
		} else {
			//txtAreaError.setText(vError);
		}
	}
	
	private void txtFieldValueChanged(boolean pNumeric, boolean pComa) {
	}

	private void enableInputFields() {
		txtDesde.setEnabled(true);
		txtHasta.setEnabled(true);
		txtNumIntervalos.setEnabled(true);
	}

	private void /*boolean*/ checkDataInput() {
		System.out.println("checkDataInput");
		if(!txtFunction.getText().equals("") && !txtDesde.getText().equals("") && !txtHasta.getText().equals("") && !txtNumIntervalos.getText().equals("") && txtAreaError.getText().equals("")){
			btnCalcular.setEnabled(true);
		} else {
			btnCalcular.setEnabled(false);
		}
	}
}
