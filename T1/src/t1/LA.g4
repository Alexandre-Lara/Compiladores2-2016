grammar LA;

@members{

void erro (String message) {
    throw new ParseCancellationException(message);
}
}

//<programa> ::= <declaracoes> algoritmo <corpo> fim_algoritmo
programa: declaracoes 'algoritmo' corpo 'fim_algoritmo';
			  
//<declaracoes> ::= <decl_local_global> <declaracoes> | ε
declaracoes : decl_local_global declaracoes | ;

//<decl_local_global> ::= <declaracao_local> | <declaracao_global>
decl_local_global : declaracao_local | declaracao_global;

/*<declaracao_local> ::= declare <variavel>
                         | constante IDENT : <tipo_basico> = <valor_constante>
			 | tipo IDENT : <tipo>
*/
declaracao_local :  'declare' variavel |
                    'constante' IDENT ':' tipo_basico '=' valor_constante |
                    'tipo' IDENT ':' tipo;
			
//<variavel> ::= IDENT <dimensao> <mais_var> : <tipo>		  
variavel: IDENT dimensao mais_var ':' tipo ;

//<mais_var> ::= , IDENT <dimensao> <mais_var> | ε
mais_var : ',' IDENT dimensao mais_var | ;

//<identificador> ::= <ponteiros_opcionais> IDENT <dimensao> <outros_ident>
identificador: ponteiros_opcionais IDENT dimensao outros_ident;

//<ponteiros_opcionais> ::= ^ <ponteiros_opcionais> | ε
ponteiros_opcionais : '^' ponteiros_opcionais | ;

//<outros_ident> ::= . <identificador> | ε
outros_ident : '.' identificador | ;

//<dimensao> ::= [ <exp_aritmetica> ] <dimensao>| ε
dimensao : '[' exp_aritmetica ']' dimensao | ;

//<tipo> ::= <registro> | <tipo_estendido>
tipo: registro | tipo_estendido;

//<mais_ident> ::= , <identificador> <mais_ident> | ε
mais_ident : ',' identificador mais_ident | ;

//<mais_variaveis> ::= <variavel> <mais_variaveis> | ε
mais_variaveis : variavel mais_variaveis | ;

//<tipo_basico> ::= literal | inteiro | real | logico
tipo_basico : 'literal'| 'inteiro' | 'real' | 'logico';
				
//<tipo_basico_ident> ::= <tipo_basico> | IDENT
tipo_basico_ident: tipo_basico| IDENT;
					  				
//<tipo_estendido> ::= <ponteiros_opcionais> <tipo_basico_ident>   
tipo_estendido: ponteiros_opcionais tipo_basico_ident;					   

//<valor_constante> ::= CADEIA | NUM_INT | NUM_REAL | verdadeiro | falso
valor_constante: CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso';

//<registro> ::= registro <variavel> <mais_variaveis> fim_registro		 
registro : 'registro' variavel mais_variaveis 'fim_registro';

/*<declaracao_global> ::= procedimento IDENT ( <parametros_opcional> ) <declaracoes_locais> <comandos> fim_procedimento
			 | funcao IDENT ( <parametros_opcional> ) : <tipo_estendido> <declaracoes_locais> <comandos> fim_funcao
*/
declaracao_global : 'procedimento' IDENT '(' parametros_opcional ')' declaracoes_locais comandos 'fim_procedimento' |
                    'funcao' IDENT '(' parametros_opcional ')' ':' tipo_estendido declaracoes_locais comandos 'fim_funcao';

//<parametros_opcional> ::= <parametro> | ε				   
parametros_opcional : parametro | ;

//<parametro> ::= <var_opcional> <identificador> <mais_ident> : <tipo_estendido> <mais_parametros>
parametro : var_opcional identificador mais_ident ':' tipo_estendido mais_parametros;

//<var_opcional> ::= var | ε
var_opcional : 'var' | ;

//<mais_parametros> ::= , <parametro> | ε
mais_parametros : ',' parametro | ;

//<declaracoes_locais> ::= <declaracao_local> <declaracoes_locais> | ε
declaracoes_locais : declaracao_local declaracoes_locais | ;

//<corpo> ::= <declaracoes_locais> <comandos>
corpo : declaracoes_locais comandos;

//<comandos> ::= <cmd> <comandos> | ε
comandos : cmd comandos | ;

/*<cmd> ::= leia ( <identificador> <mais_ident> )
		| escreva ( <expressao> <mais_expressao> )
		| se <expressao> entao <comandos> <senao_opcional> fim_se
		| caso <exp_aritmetica> seja <selecao> <senao_opcional> fim_caso
		| para IDENT <- <exp_aritmetica> ate <exp_aritmetica> faca <comandos> fim_para
		| enquanto <expressao> faca <comandos> fim_enquanto
		| faca <comandos> ate <expressao>
		| ^ IDENT <outros_ident> <dimensao> <- <expressao>
		| IDENT <chamada_atribuicao>
		| retorne <expressao>
*/
cmd :   'leia' '(' identificador mais_ident ')' |
		'escreva' '(' expressao mais_expressao ')' |
		'se' expressao 'entao' comandos senao_opcional 'fim_se' |
		'caso' exp_aritmetica 'seja' selecao senao_opcional 'fim_caso' |
		'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' comandos 'fim_para' |
		'enquanto' expressao 'faca' comandos 'fim_enquanto' |
		'faca' comandos 'ate' expressao |
		'^' IDENT outros_ident dimensao '<-' expressao |
		IDENT chamada_atribuicao |
		'retorne' expressao;

//<mais_expressao> ::= , <expressao> <mais_expressao> | ε					
mais_expressao: ',' expressao mais_expressao | ;					

//<senao_opcional> ::= senao <comandos> | ε
senao_opcional: 'senao' comandos | ;

//<chamada_atribuicao> ::= ( <argumentos_opcional> ) | <outros_ident> <dimensao> <- <expressao>
chamada_atribuicao : '(' argumentos_opcional ')' | outros_ident dimensao '<-' expressao ;

//<argumentos_opcional> ::= <expressao> <mais_expressao> | ε			   
argumentos_opcional : expressao mais_expressao | ;

//<selecao> ::= <constantes> : <comandos> <mais_selecao>
selecao: constantes ':' comandos mais_selecao ;

//<mais_selecao> ::= <selecao> | ε
mais_selecao: selecao| ;

//<constantes> ::= <numero_intervalo> <mais_constantes>
constantes: numero_intervalo mais_constantes ;

//<mais_constantes> ::= , <constantes> | ε
mais_constantes: ',' constantes| ;

//<numero_intervalo> ::= <op_unario> NUM_INT <intervalo_opcional>
numero_intervalo: op_unario NUM_INT intervalo_opcional;

//<intervalo_opcional> ::= .. <op_unario> NUM_INT | ε
intervalo_opcional: '..' op_unario NUM_INT| ;

//<op_unario> ::= - | ε
op_unario: '-'| ;

//<exp_aritmetica> ::= <termo> <outros_termos>
exp_aritmetica: termo outros_termos ;

//<op_multiplicacao> ::= * | /
op_multiplicacao: '*' | '/' ;

//<op_adicao> ::= + | -
op_adicao: '+' | '-';

//<termo> ::= <fator> <outros_fatores>
termo: fator outros_fatores ;

//<outros_termos> ::= <op_adicao> <termo> <outros_termos> | ε
outros_termos: op_adicao termo outros_termos | ;

//<fator> ::= <parcela> <outras_parcelas>
fator : parcela outras_parcelas;

//<outros_fatores> ::= <op_multiplicacao> <fator> <outros_fatores> | ε
outros_fatores: op_multiplicacao fator outros_fatores |;

//<parcela> ::= <op_unario> <parcela_unario> | <parcela_nao_unario>
parcela : op_unario parcela_unario |
	  parcela_nao_unario ;

//<parcela_unario> ::= ^ IDENT <outros_ident> <dimensao> | IDENT <chamada_partes> | NUM_INT | NUM_REAL | ( <expressao> )
parcela_unario : '^' IDENT outros_ident dimensao  |IDENT chamada_partes | NUM_INT | NUM_REAL | '(' expressao ')' ;

//<parcela_nao_unario> ::= & IDENT <outros_ident> <dimensao> | CADEIA				
parcela_nao_unario: '&' IDENT outros_ident dimensao | CADEIA;

//<outras_parcelas> ::= % <parcela> <outras_parcelas> | ε					
outras_parcelas : '%' parcela outras_parcelas| ;
	 
//<chamada_partes> ::= ( <expressao> <mais_expressao> ) | <outros_ident> <dimensao> | ε
chamada_partes : '(' expressao mais_expressao ')' | outros_ident dimensao | ;

//<exp_relacional> ::= <exp_aritmetica> <op_opcional>				
exp_relacional: exp_aritmetica op_opcional ;

//<op_opcional> ::= <op_relacional> <exp_aritmetica> | ε
op_opcional: op_relacional exp_aritmetica | ;

//<op_relacional> ::= = | <> | >= | <= | > | <
op_relacional: '=' | '<>' | '>=' | '<=' | '>' | '<';

//<expressao> ::= <termo_logico> <outros_termos_logicos>				 
expressao : termo_logico outros_termos_logicos ;

//<op_nao> ::= nao | ε
op_nao : 'nao' | ;

//<termo_logico> ::= <fator_logico> <outros_fatores_logicos>
termo_logico: fator_logico outros_fatores_logicos ;

//<outros_termos_logicos> ::= ou <termo_logico> <outros_termos_logicos> | ε
outros_termos_logicos: 'ou' termo_logico outros_termos_logicos | ;

//<outros_fatores_logicos> ::= e <fator_logico> <outros_fatores_logicos> | ε
outros_fatores_logicos: 'e' fator_logico outros_fatores_logicos | ;

//<fator_logico> ::= <op_nao> <parcela_logica>
fator_logico: op_nao parcela_logica ;

//<parcela_logica> ::= verdadeiro | falso | <exp_relacional>
parcela_logica: 'verdadeiro'| 'falso'| exp_relacional ;
					

/*IDENTIF: identificadores, é constítuido por qualquer cadeia de letras, dígitos e sublinhados que não começam
           com um dígito. Nomes (identificadores) são usados para nomear variáveis e campos de tabelas.*/

/*Um fragment denota definições regulares auxiliares*/
	fragment Letra: 'a'..'z' | 'A'..'Z';
	fragment Digito: '0'..'9';
	IDENT: (Letra | '_')(Letra | '_' | Digito )*;

//Número inteiro		
NUM_INT: Digito+;

//Número real
NUM_REAL: Digito+ '.' Digito+;

/*Cadeias de caracteres: são delimitadas por aspas simples (') ou aspas duplas ("). Neste caso, considerou-se apenas versões
			 curtas, sem sequência de escape e quebras de linha não são permitidas.*/
CADEIA: '"' ~('\r'|'\n')*? '"';

//Comentários
COMENTARIO:  '{' ~('\n'|'\r'|'\t')* '}' -> skip;

//Espaços em branco
WS: (' '|'\t'|'\n'|'\r') -> skip;

//Erro léxico
ERRO: . { erro("Linha " +getLine() + ": "+getText()+" - simbolo nao identificado"); };

//Comentário não fechado
ERRO_COMENTARIO : '{' ~('\n'|'\r'|'\t'|'}')* '\n'  { erro("Linha "+getLine()+": comentario nao fechado"); };