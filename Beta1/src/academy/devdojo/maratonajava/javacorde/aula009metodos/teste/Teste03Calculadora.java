package academy.devdojo.maratonajava.javacorde.aula009metodos.teste;

import academy.devdojo.maratonajava.javacorde.aula009metodos.dominio.Calculadora;

public class Teste03Calculadora {
    public static void main(String[] args) {
        Calculadora teste03 = new Calculadora();
        double resultado = teste03.dividirNumeradorPeloDenominador(20, 2);
        System.out.println(resultado);

        double resultado2 = teste03.dividirNumeradorPeloDenominador02(20, 2);
        System.out.println(resultado2);

        teste03.dividirNumeradorPeloDenominador03(15,0);


    }
}
