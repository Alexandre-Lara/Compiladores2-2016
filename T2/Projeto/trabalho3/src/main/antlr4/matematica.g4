grammar matematica;

/**
 * Created by alexandre on 19/12/16.
 */

programa
 : bloco EOF
 ;

bloco
 : (declaracao)* (retorno)?
 ;

retorno returns [String tipo]
 : 'retorne' expressao { $tipo = "expressao"; }
 | 'retorne' String    { $tipo = "string";    }
 ;

declaracao returns [String tipoDecl]
 : atribuicao { $tipoDecl = "atribuicao"; }
 | funcao     { $tipoDecl = "funcao";     }
 | print      { $tipoDecl = "print";      }
 ;

print returns [String tipoPrint]
 : 'print' '('(expressao     { $tipoPrint = "expressao";     }
 	         | String        { $tipoPrint = "string";        }) ')'
 ;

atribuicao
 : Identificador  '=' expressao
 ;

funcao returns [String tipo]
 : (relacao)? identificadorF '=' seno       { $tipo = "seno";     }
 | (relacao)? identificadorF '=' cosseno    { $tipo = "cosseno";  }
 | (relacao)? identificadorF '=' polinomio  { $tipo = "polinomio";}
 | (relacao)? identificadorF '=' expressao  { $tipo = "derivada"; }
 | identificadorF
 ;

expressao returns [ String tipo ]
 : '-' expressao           { $tipo = "unario";         }
 | '+' expressao           { $tipo = "unarioSoma";     }
 | integral                { $tipo = "integral";       }
 | derivada                { $tipo = "derivada";       }
 | expressao '^' expressao { $tipo = "potencia";       }
 | expressao '*' expressao { $tipo = "multiplicacao";  }
 | expressao '/' expressao { $tipo = "divisao";        }
 | expressao '+' expressao { $tipo = "soma";           }
 | expressao '-' expressao { $tipo = "subtracao";      }
 | '(' expressao ')'       { $tipo = "parenteses";     }
 | valor                   { $tipo = "valor";          }
 | identificadorF          { $tipo = "identificadorF"; }
 | X                       { $tipo = "X";              }
 | Identificador           { $tipo = "identificador";  }
 | seno                    { $tipo = "seno";           }
 | cosseno                 { $tipo = "cosseno";        }
 ;

 integral
 : 'integre' expressao 'd' X intervaloIntegracao
 ;

 derivada
 : 'derive' expressao (pontoDerivacao)?
 ;

pontoDerivacao
 : 'em' expressao
 ;

polinomio
 :
 | monomio+
 ;

monomio
 : coeficiente? incognita expoente?
 | coef2 = coeficiente
 ;

incognita
 : X
 ;

coeficiente returns [ String tipo ]
 : numeroComSinal { $tipo = "numero";}
 | expressao      { $tipo = "expressao";}
 ;

expoente
 : '^' numeroComSinal
 ;

intervaloIntegracao
 : 'de' l1 = limiteIntegracao 'a' l2 = limiteIntegracao 
 ;

limiteIntegracao
 : expressao
 ;

identificadorF
 : ID1 = Identificador '('(ID2 = X | expressao)')'
 ;

relacao
 : '{' dominio'|'contradominio'}'
 ;

dominio
 : ('N' | 'Z' | 'Q' | 'R') (intervalo)?
 ;

contradominio
 : ('N' | 'Z' | 'Q' | 'R') (intervalo)?
 ;

intervalo
 : '['valor '<->' valor']'
 ;

seno
 : 'sen''('expressao')'
 ;

cosseno
 : 'cos''('expressao')'
 ;

valor returns [ String tipo ]
 : Numero    { $tipo = "numero";    }
 | constante { $tipo = "constante"; }
 ;

constante
 :  'pi'
 |  'e'   //euler
 |  '+infinito'
 |  '-infinito'
 ;

numeroComSinal
 : Numero
 | '+'Numero
 ;

X
 : 'x'
 ;

Identificador
 : ('a'..'c'|'e'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
 ;

Numero
 : Int ('.' Digito*)?
 | '-'Int ('.' Digito*)?
 ;

String
 : '"' ~('\r'|'\n')*? '"'
	 {
	  String s = getText();
	  s = s.substring(1, s.length() - 1);
	  setText(s);
	 }
 ;

Comentario
 : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip
 ;

Espaco
 : [ \t\r\n\u000C] -> skip
 ;

Letra
 :'a'..'z'
 |'A'..'Z'
 ;

fragment Int
 : [1-9] Digito*
 | '0'
 ;

fragment Digito
 : '0'..'9'
 ;