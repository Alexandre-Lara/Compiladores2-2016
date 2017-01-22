grammar matematica;

programa
 : bloco EOF
 ;

bloco
 : (declaracao)* ('return' expressao ';')?
 ;

declaracao
 : atribuicao ';'
 | funcao     ';'
 | 'print' '(' expressao | String ')' ';'
 ;

atribuicao
 : Identificador  '=' expressao
 ;

/* Verificar:
		- recursao a esquerda aqui
		- Non-LL(*) Decision Error */
expressao
 : '-' expressao
 | integral
 | expressao '^' expressao
 | expressao '*' expressao
 | expressao '/' expressao
 | expressao '+' expressao
 | expressao '-' expressao
 | '(' expressao ')'
 | valor
 | identificadorF
 | Incognita
 | Identificador
 ;

integral
 : 'integre' expressao 'd' Incognita (intervaloInt)?
 ;

intervaloInt
 : 'de' (valor | Identificador) 'a' (valor | Identificador)
 ;

// a relacao e sempre necessaria ?
funcao
 : (relacao)? seno
 | (relacao)? cosseno
 | (relacao)? identificadorF '=' expressao
 ;

relacao
 : '{' dominio'|'contradominio'}'
 ;

identificadorF
 : Identificador '('Incognita')'
 ;

valor
 : Numero
 | Constante
 ;

seno
 : 'sen''('Incognita | expressao')'
 ;

cosseno
 : 'cos''('Incognita | expressao')'
 ;

dominio
 : 'N' | 'Z' | 'Q' | 'R' (intervalo)?
 ;

contradominio
 : 'N' | 'Z' | 'Q' | 'R' (intervalo)?
 ;

intervalo
 : '['valor '..' valor']'
 ;

Constante
 : '+infinito'
 | '-infinito'
 | 'pi'
 | 'e'   //euler
 ;

Numero
 : Int ('.' Digito*)?
 ;

Identificador
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

Incognita
 :[a-zA-Z_]
 ;

 String
 : '"' ~('\r' | '\n' | '"')* '"'
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
 : [0-9]
 ;