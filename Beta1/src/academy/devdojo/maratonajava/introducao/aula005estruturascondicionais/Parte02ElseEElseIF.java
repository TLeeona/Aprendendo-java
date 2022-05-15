package academy.devdojo.maratonajava.introducao.aula005estruturascondicionais;

public class Parte02ElseEElseIF {
    public static void main(String[] args) {
        //Else - É a mesma condição do IF, porém ele só é executado quando a condisão é falsa.

        int idadeDoCliente = 18;
        boolean isIdadeMinimaParaComprarEConsumirBebidaAlcoolica = idadeDoCliente >=21;
        if (isIdadeMinimaParaComprarEConsumirBebidaAlcoolica) {
            System.out.println("O cliente está autorizado a comprar");
        }else { //Quando colocar else ao terminar o if, não precisa
            System.out.println("O cliente não está autorizado a comprar");
        }
        /* A diferença entre o else e o if com o ! dentro do () é que. Se a primeira sentença foi verdadeira, o código
        ignora o else, pois não interessa mais a ele. Já o if (!) é independendo da outra e o codigo vai analizar.
         */

        //Else If - É usando quando tem mais de duas consições para ocorre.
        /* Categoria do Jogadores de LOL.
        Pontos <= 100 - Ferro
        Pontos >100 e <=200 - Bronze
        Pontos >200 e <=300 - Prata
        Pontos >300 - Ouro ou maior
         */
        int pontuacaoDoJogador01 = 450;
        if (pontuacaoDoJogador01 <= 100){
            System.out.println("Elo Ferro");
        } else if (pontuacaoDoJogador01 >100 && pontuacaoDoJogador01 <=200) {
            System.out.println("Elo Bronze");
        } else if (pontuacaoDoJogador01 >200 && pontuacaoDoJogador01 <=300) {
            System.out.println("Elo Prata");
        } else {
            System.out.println("Elo Ouro ou maior.");
        }
        //Simplificando e limpando
        int pontuacaoDoJogador02 = 287;
        String categoria;
        if (pontuacaoDoJogador02 <= 100){
            categoria = "Elo Ferro";
        } else if (pontuacaoDoJogador02 >100 && pontuacaoDoJogador02 <=200) {
            categoria = "Elo Bronze";
        } else if (pontuacaoDoJogador02 >200 && pontuacaoDoJogador02 <=300) {
            categoria = "Elo Prata";
        } else {
            categoria = "Elo Ouro ou maior";
        }
        System.out.println(categoria);
        //Variáveis locais são inicializadas antes. Então se tiver algo faltando, vai da erro de copilação e não vai rodar.
    }
}
