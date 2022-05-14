package academy.devdojo.maratonajava.introducao.aula004operadores;

public class Parte01Aritmetricos {
    public static void main(String[] args) {
        //Operdores básicos: +, -, / e *.
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero02-numero01);

        System.out.println("Valor "+numero02+numero01);
        /* Para essa situação, o simbolo de soma antes do numero02 diz para o sistema que não vai ser uma soma e sim
         * concatecação, uma junção. Por isso, tome cuidado com o operador dentro do System Out Print.
         */
        int resultadoDaSoma = numero02+numero01;
        System.out.println(resultadoDaSoma);

        int resultadoDasubtracao = numero02-numero01;
        System.out.println(resultadoDasubtracao);

        int resuldadoDaMultiplicacao = numero01*numero02;
        System.out.println(resuldadoDaMultiplicacao);

        int resultadoDaDivisao = numero01/numero02;
        System.out.println(resultadoDaDivisao);
        /*Ao colocar tentar fazer essa divisão, o resultado impresso é o numéro zero. Pois o numéro que deveria sair
         * é um número decimal e as variáveis usadas, tanto a variável resultadoDaDivisao quanto para as variáveis
         * numero01 e numero02, são variáveis de números interios. Para que essa equação sejá bem-sucedida, tem que
         * colocar um variável para números decinais como Double e Float.
         */
        int numero03 = 10;
        float numero04 = 20f;
        double novoResultadoDaDivisao = numero03/numero04;
        System.out.println(novoResultadoDaDivisao);
        //ou
        int numero05 = 10;
        int numero06 = 20;
        double segundoResultadoDadivisao = numero05/ (double) numero06;
        System.out.println(segundoResultadoDadivisao);
    }
}
