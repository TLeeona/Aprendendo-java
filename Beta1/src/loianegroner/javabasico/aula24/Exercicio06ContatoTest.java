package loianegroner.javabasico.aula24;

public class Exercicio06ContatoTest {
    public static void main(String[] args) {

        Exercicio06Contato contato01 = new Exercicio06Contato();
        contato01.nomeDoContato = "Maria Isabel";
        contato01.enderacoDocContato = "Av. Mariana, 0";
        contato01.emailDoContato = "mariaisabelgomes@email.com";
        contato01.apelidoDoContato = "Bel prima";
        contato01.numeroDoContato = new String[2];
            contato01.numeroDoContato[0] = "00000-0000";
            contato01.numeroDoContato[1] = "00000-0001";
            contato01.numeroDoContato[2] = "00000-0002";

        System.out.println(contato01.apelidoDoContato);

        Exercicio06Contato contato02 = new Exercicio06Contato();
        contato02.nomeDoContato = "Pedro";
        contato02.enderacoDocContato = "Rua 48";
        contato02.emailDoContato = "pedrosilva@email.com";
        contato02.apelidoDoContato = "Amor";
        contato02.numeroDoContato = new String[2];
            contato02.numeroDoContato[0] = "99999-9999";

        System.out.println(contato02.apelidoDoContato);

    }
}
