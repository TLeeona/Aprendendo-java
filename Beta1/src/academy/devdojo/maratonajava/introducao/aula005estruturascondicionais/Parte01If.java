package academy.devdojo.maratonajava.introducao.aula005estruturascondicionais;

public class Parte01If {
    public static void main(String[] args) {
        /* IF (Se) - condição se. Ex.: Se eu trabalhar, consigo dinheiro. Se eu tiver dineiro, consigo comprar intes.
        A consicional precisa ser Booleana.
         */
        if (true) {//Nesse caso o if só é executando se a condição for verdadeira. O if tem um bloco de codico.
            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");

        int idadeDoCliente = 20;
        if (idadeDoCliente >= 18) {
            System.out.println("Autorizado a comprar bebida alcoolica"); //esse sout é para o if.
        }

        //É mais usual usar senteça que esta dentro do if, no exemplo acima, em uma váriavel booleana.
        int idadeDoSegundoCliente = 17;
        boolean isAutorizacaoParaCompraBebidaAlcoolicaDoSegundoCliente = idadeDoSegundoCliente >= 18;
        if (isAutorizacaoParaCompraBebidaAlcoolicaDoSegundoCliente){
            System.out.println("Autorizado a comprar bebida alcoolica");
        }
        //Para fazer o contraido pode usar ! antes do nome da variável
        if (isAutorizacaoParaCompraBebidaAlcoolicaDoSegundoCliente != true) {
            System.out.println("Segundo Cliente Não Autorizado");
        }

        //Para uma festa, foram distribuidos 200 convites com numerações de 1 a 200. Identifique em quem o pedetra.

        int conviteDaPessoa01 = 153;
        boolean isChecagemDoConviteDaPessoa01 = conviteDaPessoa01 >=1 && conviteDaPessoa01 <=200;
        if (isChecagemDoConviteDaPessoa01) {
            System.out.println("Pessoa 01 está autorizada a entrar na festa.");
        }
        if (!isChecagemDoConviteDaPessoa01) {
            System.out.println("Pessoa 01 é penetra.");
        }

        int conviteDaPessoa02 = 217;
        boolean isChecagemDoConviteDaPessoa02 = conviteDaPessoa02 >=1 && conviteDaPessoa02 <=200;
        if (isChecagemDoConviteDaPessoa02){
            System.out.println("Pessoa 02 está autorizada a entrar na festa.");
        }
        if (!isChecagemDoConviteDaPessoa02){
            System.out.println("Pessoa 02 é penetra.");
        }

    }
}
