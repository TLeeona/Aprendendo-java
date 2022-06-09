package academy.devdojo.maratonajava.introducao.aula007arrays;

public class Parte03 {
    public static void main(String[] args) {
        //Formas de simplificar o Arrays

        int[] numeros = {1,2,3,4,5}; //Dessa forma, você economiza linhas. Dentro das chaves ele entendo que os valores
        //para ser armazenados são esses, separados pela vírgula. E a quantidade é a quantidade de espaço.
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        int[] numeros2 = new int[]{6,7,8,9,0};
        for (int i= 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }

        //Foreach é uma versão simplificada do For
        
        int[] numeros3 = {10,20,30,40,50};
        for ( int i:numeros3) { //Você pode nomear como quiser.
            System.out.println(i);
        }
        
    }
}
