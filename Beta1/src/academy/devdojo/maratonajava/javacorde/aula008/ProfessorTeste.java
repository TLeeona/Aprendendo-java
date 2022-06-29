package academy.devdojo.maratonajava.javacorde.aula008;

public class ProfessorTeste {
    public static void main(String[] args) {
        ProfessorDominio professor = new ProfessorDominio();
        professor.nome = "Mestre Kami";
        professor.idade = 75;
        professor.sexo = 'M';
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
