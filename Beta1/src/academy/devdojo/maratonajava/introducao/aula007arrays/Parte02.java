package academy.devdojo.maratonajava.introducao.aula007arrays;

public class Parte02 {
    public static void main(String[] args) {
        //Por padrão, quando as variáveis: Byte, Short, Int, Long, Float e Double está vazia é immpresso 0.
        //Para Char é '/u0000' que é ' '.
        //Para Booleana é false e String null.

        String [] nomes = new String[3];
        nomes[0]="Maria";
        nomes[1]="Ana";
        nomes[2]="Julia";

        for (int i = 0; i < 3; i++){
            System.out.println(nomes[i]);
        }
        //Infelizmente é preciso alterar manualmente a quantidade de espaços.

        //Em vez de ficar alterando a quantidade de espaços dentro do for, você pode colocar o
        // nomedavariáveis.(ponto)length

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]+ " 2");
        }
    }
}
