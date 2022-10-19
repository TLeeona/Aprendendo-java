package academy.devdojo.maratonajava.javacorde.aula009metodos.teste;

import academy.devdojo.maratonajava.javacorde.aula009metodos.dominio.Calculadora;

public class Teste02Calculadora {
    //Parâmetros
    public static void main(String[] args) {
        Calculadora teste02 = new Calculadora();
        teste02.multiplicarNumeradorEDenominador(80, 4); //Tomar cuidado o primitivo que vai usar. Alguém pode inserir número que não corresponder aquele tipo.
        //Se alguém colocar um número decimal, vai dar erro.
    }
}