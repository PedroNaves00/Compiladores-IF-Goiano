grammar BCC;

// Tokens Básicos
TIPO_VAR
    : 'SENSOR' | 'DISPOSITIVO';

ID
    : [a-zA-Z_] [a-zA-Z_0-9]*;

NUMERO
    : [0-9]+ ('.' [0-9]+)?;

OP_COMPARACAO
    : '<' | '>' | '<=' | '>=' | '==' | '!=';

OP_ARITMETICA
    : '+' | '-' | '*' | '/';

OP_LOGICA
    : 'E' | 'OU';

PALAVRAS_CHAVE
    : 'IRRIGAR' | 'SE' | 'SENAO' | 'LIGAR' | 'DESLIGAR' | 'ATRIBUIR' | 'PAUSAR' | 'IMPRIMIR' | 'REPETIR' | 'INICIO' | 'FIM';

DELIMITADOR
    : '{' | '}' | '(' | ')' | ':' | ',';

WHITESPACE
    : [ \t\r\n]+ -> skip;

// Regras da Linguagem
programa
    : 'IRRIGAR' ID '{' listaDeclaracoes listaComandos '}';

listaDeclaracoes
    : declaracao (',' declaracao)*;

declaracao
    : TIPO_VAR ID '=' ID;

listaComandos
    : comando (',' comando)*;

comando
    : comandoCondicional
    | comandoAtribuicao
    | comandoAtivacao
    | comandoRepeticao
    | comandoSaida
    | blocoComandos;

comandoCondicional
    : 'SE' '(' expressaoRelacional ')' '{' listaComandos '}'
      ('SENAO' '{' listaComandos '}')?;

comandoAtribuicao
    : 'ATRIBUIR' expressaoAritmetica 'A' ID;

comandoAtivacao
    : 'LIGAR' '(' ID ')' | 'DESLIGAR' '(' ID ')';

comandoRepeticao
    : 'REPETIR' 'A CADA' NUMERO 'MIN' '{' listaComandos '}';

comandoSaida
    : 'IMPRIMIR' '(' expressao ')';

blocoComandos
    : 'INICIO' listaComandos 'FIM';

expressaoRelacional
    : expressao OP_COMPARACAO expressao;

expressaoLogica
    : expressaoRelacional OP_LOGICA expressaoRelacional;

expressaoAritmetica
    : expressaoAritmetica OP_ARITMETICA termo | termo;

termo
    : NUMERO | ID | '(' expressao ')';

expressao
    : expressaoAritmetica
    | expressaoRelacional
    | expressaoLogica;