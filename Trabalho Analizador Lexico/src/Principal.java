import javax.swing.JFileChooser;

public class Principal {

    public static void main(String[] args) {
        String caminho = "";
        JFileChooser fc = new JFileChooser();
        int retorno = fc.showOpenDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminho = fc.getSelectedFile().getAbsolutePath();
            System.out.println("Analisando arquivo: " + caminho);
        }

        Analisador analisador = new Analisador(caminho);
        Token token;

        while ((token = analisador.proximoToken()) != null) {
            System.out.println(token);
        }
    }
}
