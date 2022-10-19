package academy.devdojo.maratonajava.javacorde.aula009metodos.teste;

import academy.devdojo.maratonajava.javacorde.aula009metodos.dominio.Calculadora;

public class Teste01Calculadora {
    public static void main(String[] args) {
        Calculadora teste01 = new Calculadora();
        teste01.somarDoisNumeros();
        System.out.println("-------");

        teste01.subtrairDoisNumeros();
        System.out.println("-------");
    }
}
