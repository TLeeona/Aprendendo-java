package academy.devdojo.maratonajava.javacorde.aula008;

public class Parte02ProfessorTeste {
    public static void main(String[] args) {
        Parte02ProfessorDominio professor = new Parte02ProfessorDominio();
        professor.nome = "Mestre Kami";
        professor.idade = 75;
        professor.sexo = 'M';
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
