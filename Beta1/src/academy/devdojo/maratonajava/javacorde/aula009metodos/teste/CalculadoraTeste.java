package academy.devdojo.maratonajava.javacorde.aula009metodos.teste;

import academy.devdojo.maratonajava.javacorde.aula009metodos.dominio.CalculadoraDominio;

public class CalculadoraTeste {
    public static void main(String[] args) {
        CalculadoraDominio calculadoraDominio = new CalculadoraDominio();
        calculadoraDominio.somarDoisNumeros();
        System.out.println("-------");

        calculadoraDominio.subtrairDoisNumeros();
        System.out.println("-------");
    }
}
