grammar LA;

@members{
//Alessandra Camargo
//Alexandre Lara
//Lucas Callegari
//Tiago Avellar
static String grupo = "<, , 551996, 551910>"; 
PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
}


//<programa> ::= <declaracoes> algoritmo <corpo> fim_algoritmo
programa: declaracoes 'algoritmo' corpo 'fim_algoritmo';

//<declaracoes> ::= <decl_local_global> <declaracoes> | ε
declaracoes: (declaracao_local_global declaracoes)?;

//<decl_local_global> ::= <declaracao_local> | <declaracao_global>
declaracao_local_global: declaracao_local | declaracao_global;

/*<declaracao_local> ::= declare <variavel>
                       | constante IDENT : <tipo_basico> = <valor_constante>
                       | tipo IDENT : <tipo>
*/
declaracao_local: 'declare' variavel | 
                  'constante' IDENTIF ':' tipo_basico '=' valor_constante |
		  'tipo' IDENTIF ':' tipo;
		
//<variavel> ::= IDENT <dimensao> <mais_var> : <tipo>		  
variavel: IDENTIF dimensao mais_var ':' tipo;

//<mais_var> ::= , IDENT <dimensao> <mais_var> | ε
mais_var: (',' IDENTIF dimensao mais_var)?;

//<identificador> ::= <ponteiros_opcionais> IDENT <dimensao> <outros_ident>
identificador: ponteiros_opcionais IDENTIF dimensao outros_identificadores;

//<ponteiros_opcionais> ::= ^ <ponteiros_opcionais> | ε
ponteiros_opcionais: ('^' ponteiros_opcionais)?;

//<outros_ident> ::= . <identificador> | ε
outros_identificadores: ('.' identificador)?;

//<dimensao> ::= [ <exp_aritmetica> ] <dimensao>| ε
dimensao: ('[' expressao_aritmetica ']' dimensao)?;

//<tipo> ::= <registro> | <tipo_estendido>
tipo: registro | tipo_estendido;

//<mais_ident> ::= , <identificador> <mais_ident> | ε
mais_identificadores: (',' identificador mais_identificadores)?;

//<mais_variaveis> ::= <variavel> <mais_variaveis> | ε
mais_variaveis: (variavel mais_variaveis)?;

//<tipo_basico> ::= literal | inteiro | real | logico
tipo_basico: 'literal' | 'inteiro' | 'real' | 'logico';
			
//<tipo_basico_ident> ::= <tipo_basico> | IDENT
tipo_basico_identificador: tipo_basico | IDENTIF;
						
//<tipo_estendido> ::= <ponteiros_opcionais> <tipo_basico_ident>   
tipo_estendido: ponteiros_opcionais tipo_basico_identificador;						   

//<valor_constante> ::= CADEIA | NUM_INT | NUM_REAL | verdadeiro | falso
valor_constante: CADEIA | INTEIRO | REAL | 'verdadeiro' | 'falso';

//<registro> ::= registro <variavel> <mais_variaveis> fim_registro		 
registro: 'registro' variavel mais_variaveis 'fim_registro';

/*<declaracao_global> ::= procedimento IDENT ( <parametros_opcional> ) <declaracoes_locais> <comandos> fim_procedimento
                         | funcao IDENT ( <parametros_opcional> ) : <tipo_estendido> <declaracoes_locais> <comandos> fim_funcao
*/
declaracao_global: 'procedimento' IDENTIF '(' parametros_opcionais ')' declaracoes_locais comandos 'fim_procedimento' |
                   'funcao' IDENTIF '(' parametros_opcionais ')' ':' tipo_estendido declaracoes_locais comandos 'fim_funcao';

//<parametros_opcional> ::= <parametro> | ε				   
parametros_opcionais: (parametro)?;

//<parametro> ::= <var_opcional> <identificador> <mais_ident> : <tipo_estendido> <mais_parametros>
parametro: var_opcional identificador mais_identificadores ':' tipo_estendido mais_parametros;

//<var_opcional> ::= var | ε
var_opcional: ('var')?;

//<mais_parametros> ::= , <parametro> | ε
mais_parametros: (',' parametro)?;

//
declaracoes_locais: (declaracao_local declaracoes_locais)?;

//
corpo: declaracoes_locais comandos;

//
comandos: (cmd comandos)?;

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
cmd: 'leia' '(' identificador mais_identificadores ')' |
	 'escreva' '(' expressao mais_expressao ')' |
	 'se' expressao 'entao' comandos senao_opcional 'fim_se' |
	 'caso' expressao_aritmetica 'seja' selecao senao_opcional 'fim_caso' |
	 'para' IDENTIF '<-' expressao_aritmetica 'ate' expressao_aritmetica 'faca' comandos 'fim_para' |
	 'enquanto' expressao 'faca' comandos 'fim_enquanto' |
	 'faca' comandos 'ate' expressao |
	 '^' IDENTIF outros_identificadores dimensao '<-' expressao |
	 IDENTIF chamada_atribuicao |
	 'retorne' expressao;
					
mais_expressao: (',' expressao mais_expressao)?;					

senao_opcional: ('senao' comandos)?;

chamada_atribuicao: '(' argumentos_opcionais ')' | outros_identificadores dimensao '<-' expressao;
				   
argumentos_opcionais: (expressao mais_expressao)?;

selecao: constantes ':' comandos mais_selecao;

mais_selecao: (selecao)?;

constantes: numero_intervalo mais_constantes;

mais_constantes: (',' constantes)?;

numero_intervalo: operador_uniario INTEIRO intervalo_opcional;

intervalo_opcional: ('..' operador_uniario INTEIRO)?;

operador_uniario: ('-')?;

expressao_aritmetica: termo outros_termos;

operador_multiplicacao: '*' | '/';

operador_adicao: '+' | '-';

termo: fator outros_fatores;

outros_termos:  (operador_adicao termo outros_termos)?;

fator: parcela outras_parcelas;

outros_fatores: (operador_multiplicacao fator outros_fatores)?;

parcela: operador_uniario parcela_unario | parcela_nao_unario;

parcela_unario: '^' IDENTIF outros_identificadores dimensao |
				IDENTIF chamada_partes |
				INTEIRO |
				REAL |
				'(' expressao ')';
				
parcela_nao_unario: '&' IDENTIF outros_identificadores dimensao |
					CADEIA;
					
outras_parcelas: ('%' parcela outras_parcelas)?;
 
/*Não consegui colocar o vazio ()? e nem |, por isso deixei sem*/
chamada_partes: '(' expressao mais_expressao ')' | outros_identificadores dimensao;
				
expressao_relacional: expressao_aritmetica operador_opcional;

operador_opcional: (operador_relacional expressao_aritmetica)?;

operador_relacional: '=' | '<>' | '>=' | '<=' | '>' | '<' ;
					 
expressao: termo_logico outros_termos_logicos;

operador_nao: ('nao')?;

termo_logico: fator_logico outros_fatores_logicos;

outros_termos_logicos: ('ou' termo_logico outros_termos_logicos)?;

outros_fatores_logicos: ('e' fator_logico outros_fatores_logicos)?;

fator_logico: operador_nao parcela_logica;

parcela_logica: 'verdadeiro' |
				'falso' |
				expressao_relacional;
				

/*IDENTIF: identificadores, é constítuido por qualquer cadeia de letras, dígitos e sublinhados que não começam
         com um dígito. Nomes (identificadores) são usados para nomear variáveis e campos de tabelas.*/

    /*Um fragment denota definições regulares auxiliares*/
    fragment Letra: 'a'..'z' | 'A'..'B';
    fragment Digito: '0'..'9';
    IDENTIF: (Letra | '_')(Letra | '_' | Digito )*;
				
INTEIRO: [Digito]+;

REAL: [Digito]+ '.' [Digito]+;

/*Cadeias de caracteres: são delimitadas por aspas simples (') ou aspas duplas ("). Neste caso, considerou-se apenas versões
                         curtas, sem sequência de escape e quebras de linha não são permitidas.*/
    
CADEIA: ('\'' | '"')(~('\'' | '"'))*('\'' | '"');

COMENTARIO:  '{' ~('\n'|'\r'|'\t'|'}')* '}' -> skip;