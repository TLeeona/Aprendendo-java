package academy.devdojo.maratonajava.introducao.aula004operadores;

public class Parte03Logicos {
    public static void main(String[] args) {
        /*Mais alguns operadores logicos são:
        E (and) - Padrão && - Sentido de adicionar. Ex.: Recife tem o melhor e maior carnaval do mundo;
        Ou (or) - Padrão || - Sentido de troca. Ex.: Recife está chuvendo ou fazendo sol;
        Negação (not) - Padrão ! - Sentido de negação. Ex.: Recife não é um estado.

        Para fazer exemplificar esses operadores, mas utilizar um exeplo parecido com o exemplo apresentado na videoaula.

        O salário mínimo para quem tem até 30 anos é R$3.000,00, acima de 30 anos o salário minimo é R$3.500,00.
        */
        //E - &&
        int idadeDeFrancisco = 27;
        int idadeDePedro = 24;
        int idadeDeJoao = 42;
        int idadeDeRicardo = 35;
        float salarioDeFrancisco = 3150.24f;
        float salarioDePedro = 2999.99f;
        float salarioDeJoao = 3515.00f;
        float salarioDeRicardo = 3431.58f;
        boolean salarioDeFranciscoEstaDentroDaLei = idadeDeFrancisco <= 30 && salarioDeFrancisco >= 3000;
        boolean salarioDePedroEstaDentroDaLei = idadeDePedro <= 30 && salarioDePedro >= 3000;
        boolean salarioDeJoaoEstaDentroDaLei = idadeDeJoao >= 35 && salarioDeJoao >= 3500;
        boolean salarioDeRicardoEstaDentroDaLei = idadeDeRicardo >= 35 && salarioDeRicardo >= 3500;
        System.out.println("O salario de Francisco esta dentro da lei " + salarioDeFranciscoEstaDentroDaLei);
        System.out.println("O salario de Pedro esta dentro da lei " + salarioDePedroEstaDentroDaLei);
        System.out.println("O salario de João esta dentro da lei " + salarioDeJoaoEstaDentroDaLei);
        System.out.println("O salario de Ricardo esta dentro da lei " + salarioDeRicardoEstaDentroDaLei);

        //Ou - ||
        float valorTotalDaContaCorrente = 2500f;
        double valorTotalDaContaPoupança = 32000;
        double precoDoIphone13 = 11000;
        boolean ehPossvilComprarUmIphone13 = valorTotalDaContaCorrente >= precoDoIphone13 || valorTotalDaContaPoupança
                >= precoDoIphone13;
        System.out.println("Consigo comprar um Iphone 13, com as minhas economias " + ehPossvilComprarUmIphone13);


    }
}
