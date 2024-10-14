public class Analisador {
    Entrada entrada;
    int caractereLidoAnterior = -1;

    public Analisador(String arquivo) {
        entrada = new Entrada(arquivo);
    }

    public Token proximoToken() {
        int caractereLido;
        while ((caractereLido = lerProximoCaractere()) != -1) {
            char c = (char) caractereLido;

            // Ignorar espaços em branco e caracteres de controle
            if (Character.isWhitespace(c)) {
                continue;
            }

            // Ler uma palavra alfabética
            if (Character.isLetter(c)) {
                StringBuilder palavra = new StringBuilder();
                palavra.append(c);
                while (Character.isLetterOrDigit((char) (caractereLido = lerProximoCaractere())) || (char) caractereLido == '_') {
                    palavra.append((char) caractereLido);
                }
                retrocederCaractere(caractereLido);

                // Verificar se é uma palavra-chave
                String palavraStr = palavra.toString();
                switch (palavraStr) {
                    case "irrigar": return new Token(TipoToken.IRRIGAR, palavraStr);
                    case "sensor": return new Token(TipoToken.SENSOR, palavraStr);
                    case "dispositivo": return new Token(TipoToken.DISPOSITIVO, palavraStr);
                    case "se": return new Token(TipoToken.SE, palavraStr);
                    case "senão": return new Token(TipoToken.SENAO, palavraStr);
                    case "ligar": return new Token(TipoToken.LIGAR, palavraStr);
                    case "desligar": return new Token(TipoToken.DESLIGAR, palavraStr);
                    case "pausar": return new Token(TipoToken.PAUSAR, palavraStr);
                    case "repetir": return new Token(TipoToken.REPETIR, palavraStr);
                    case "a":
                        // Verificar se é "a cada"
                        StringBuilder resto = new StringBuilder(palavraStr);
                        caractereLido = lerProximoCaractere();
                        if (caractereLido == ' ') {
                            resto.append(' ');
                            while (Character.isLetter((char) (caractereLido = lerProximoCaractere()))) {
                                resto.append((char) caractereLido);
                            }
                            if (resto.toString().equals("a cada")) {
                                return new Token(TipoToken.A_CADA, resto.toString());
                            }
                        }
                        retrocederCaractere(caractereLido);
                        return new Token(TipoToken.IDENTIFICADOR, palavraStr);
                    default:
                        return new Token(TipoToken.IDENTIFICADOR, palavraStr);
                }
            } else if (Character.isDigit(c)) {
                StringBuilder valor = new StringBuilder();
                valor.append(c);
                while (Character.isDigit((char) (caractereLido = lerProximoCaractere()))) {
                    valor.append((char) caractereLido);
                }
                retrocederCaractere(caractereLido);
                return new Token(TipoToken.VALOR, valor.toString());
            } else {
                // Reconhecimento de caracteres especiais
                switch (c) {
                    case '{': return new Token(TipoToken.ABRE_CHAVE, "{");
                    case '}': return new Token(TipoToken.FECHA_CHAVE, "}");
                    case '(': return new Token(TipoToken.ABRE_PARENTESE, "(");
                    case ')': return new Token(TipoToken.FECHA_PARENTESE, ")");
                    case ',': return new Token(TipoToken.VIRGULA, ",");
                    case '=': return new Token(TipoToken.IGUAL, "=");
                    case '<':
                    case '>':
                    case '!':
                        String operador = "" + c;
                        caractereLido = lerProximoCaractere();
                        if (caractereLido == '=') {
                            operador += (char) caractereLido;
                        } else {
                            retrocederCaractere(caractereLido);
                        }
                        return new Token(TipoToken.OPERADOR_RELACIONAL, operador);
                    default:
                        throw new IllegalArgumentException("Caractere inválido: " + c);
                }
            }
        }
        return null;
    }

    private int lerProximoCaractere() {
        if (caractereLidoAnterior != -1) {
            int temp = caractereLidoAnterior;
            caractereLidoAnterior = -1;
            return temp;
        } else {
            return entrada.lerProximoCaractere();
        }
    }

    private void retrocederCaractere(int caractere) {
        caractereLidoAnterior = caractere;
    }
}
