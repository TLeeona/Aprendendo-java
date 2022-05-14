package academy.devdojo.maratonajava.introducao.aula004operadores;

public class Parte02Logicos {
    public static void main(String[] args) {
        /* Operador Resto - O resto, na divisão, pode ser utilizado para identificar se o número é par ou ímpar. Seu
         * símbolo é %.
         */
        int resta01 = 20 % 3;
        System.out.println(resta01);

        /* Operadores Lógicos - Não retornam valores aritmetricos, só retornam valores boolean sempre que for falso.
         * Alguns deles são: < maior que, > menor que, <= maior ou igual, >= menor ou igual, == igualdade (Já que só um = é
         * usado para dar valor a variável) e != diferente.
         * Ao trabalhar com tipo booleandos existe um padrão, colocar "is" e depois dar o nome para a variável.
         */
        boolean isDezMaiorQueVinte = 10>20;
        System.out.println(isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10<20;
        System.out.println(isDezMenorQueVinte);
        boolean isDezIgualVinte = 10==20;
        System.out.println(isDezIgualVinte);
        boolean isDezIgualDez = 10==10;
        System.out.println(isDezIgualDez);
        boolean isDezDiferenteDez = 10!=10;
        System.out.println(isDezDiferenteDez);
        boolean isDezDiferenteVinte = 10!=20;
        System.out.println(isDezDiferenteVinte);

        //Extra
        int numero01 = 1;
        int numero02 = 2;
        int numero03 = 3;
        int numero04 = 4;
        int soma01 = numero01+numero04;
        int soma02 = numero02+numero03;
        boolean isSoma01IgualSoma02 = soma01==soma02;
        System.out.println(isSoma01IgualSoma02);

    }
}