grammar BCC;

TIPO_VAR
    : 'INTEIRO' | 'REAL';

NUM_INT
    : ('0'..'9') +
;

NUM_REAL
    : ('0'..'9') + ('.'('0'..'9')+)? // CAI NA PROVA
;

VARIAVEL
    : ('a'..'z' | 'A'..'Z')
    ('a'..'z' | 'A'..'Z' | ('0'..'9')*
    )
;

OP_ARIT1
    :  '+' | '-'
;

OP_ARIT2
    : '*' | '/'
;

OP_REL
    : '>' | '<' | '>=' | '<=' | '=' | '==' | '!='
;

OP_BOOL
    : 'e' | 'ou'
;

programa
    : ':' 'DECLARACOES'
listaDeclaracoes ':' 'ALGORITMO'
listaComandos
;

listaDeclaracoes
    : declaracao listaDeclaracoes | declaracao
;

declaracao
    : TIPO_VAR ':' VARIAVEL
;

expressaoAritmetica
    : expressaoAritmetica OP_ARIT1 termoAritmetico | termoAritmetico
;

termoAritmetico
    : termoAritmetico OP_ARIT2 fatorAritmetico | fatorAritmetico
;

fatorAritmetico
    : NUM_INT | NUM_REAL | VARIAVEL | '(' expressaoAritmetica ')'
;

expressaoRelacional
    : expressaoRelacional OP_BOOL termoRelacional | termoRelacional
;

termoRelacional
    : expressaoAritmetica OP_REL expressaoRelacional
    '('expressaoRelacional ')'
;

listaComandos
    : comando listaComandos | comando
;

comando
    : comandoAtribuicao |
    comandoEntrada |
    comandoSaida |
    comandoCondicao |
    comandoRepeticao |
    subAlgoritmo
;

comandoAtribuicao
    : 'ATRIBUIR' expressaoAritmetica 'A' VARIAVEL
;

comandoEntrada
    : 'LER' VARIAVEL
;

comandoSaida
    : 'IMPRIMIR' expressaoAritmetica
;

comandoCondicao
    : 'SE' expressaoRelacional 'ENTAO' comando |
    'SE' expressaoRelacional 'ENTAO' comando 'SENAO' comando
;

comandoRepeticao
    : 'ENQUANTO' expressaoRelacional comando
;

subAlgoritmo
    : 'INICIO' listaComandos 'FIM'
;
