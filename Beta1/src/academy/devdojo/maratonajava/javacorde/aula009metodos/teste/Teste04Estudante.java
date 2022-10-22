package academy.devdojo.maratonajava.javacorde.aula009metodos.teste;

import academy.devdojo.maratonajava.javacorde.aula009metodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacorde.aula009metodos.dominio.ImpressoraEstudante;

public class Teste04Estudante {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Pedro";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Julia";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("_________________________");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}