grammar matematica;
programa
 : bloco EOF
 ;

bloco
 : (declaracao)* (retorno)?
 ;

retorno returns [String tipo]
 :'return' (expressao { $tipo = "expressao"; } | String { $tipo = "string"; } )
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

funcao
 : (relacao)? seno
 | (relacao)? cosseno
 | (relacao)? identificadorF '=' expressao
 ;

 integral
 : 'integre' expressao 'd' Identificador (intervaloInt)?
 ;

expressao returns [ String tipo ]
 : '-' expressao           { $tipo = "unario";         }
 | integral                { $tipo = "integral";       }
 | expressao '^' expressao { $tipo = "potencia";       }
 | expressao '*' expressao { $tipo = "multiplicacao";  }
 | expressao '/' expressao { $tipo = "divisao";        }
 | expressao '+' expressao { $tipo = "soma";           }
 | expressao '-' expressao { $tipo = "subtracao";      }
 | '(' expressao ')'       { $tipo = "parenteses";     }
 | valor                   { $tipo = "valor";          }
 | identificadorF          { $tipo = "identificadorF"; }
 | Identificador           { $tipo = "identificador";  }
 | seno                    { $tipo = "seno";           }
 | cosseno                 { $tipo = "cosseno";        }
 ;

intervaloInt
 : 'de' (valor | ID1 = Identificador) 'a' (valor | ID2 = Identificador)
 ;

identificadorF
 : ID1 = Identificador '('ID2 = Identificador')'
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
 : '+infinito'
 | '-infinito'
 | 'pi'
 | 'e'   //euler
 ;

Identificador
 : ('a'..'c'|'e'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
 ;

Numero
 : Int ('.' Digito*)?
 | '-'Int ('.' Digito*)?
 ;

Letra
 : 'a'..'z'
 | 'A'..'Z'
 ;

String
 : '"' ~('\r'|'\n')*? '"'
 ;

Comentario
 : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip
 ;

Espaco
 : [ \t\r\n\u000C] -> skip
 ;

fragment Int
 : [1-9] Digito*
 | '0'
 ;

fragment Digito
 : '0'..'9'
 ;