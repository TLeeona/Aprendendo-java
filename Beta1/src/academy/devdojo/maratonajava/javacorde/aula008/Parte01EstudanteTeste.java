package academy.devdojo.maratonajava.javacorde.aula008;

public class Parte01EstudanteTeste {
    public static void main(String[] args) {
        Parte01EstudanteDominio estudante = new Parte01EstudanteDominio();
        estudante.nome = "Hinata";
        estudante.idade = 27;
        estudante.sexo = 'F';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}