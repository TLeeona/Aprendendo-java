package academy.devdojo.maratonajava.javacorde.aula008classes;

import academy.devdojo.maratonajava.javacorde.aula008classes.EstudanteDominio;

public class EstudanteTeste {
    public static void main(String[] args) {
        EstudanteDominio estudante = new EstudanteDominio();
        estudante.nome = "Hinata";
        estudante.idade = 27;
        estudante.sexo = 'F';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}