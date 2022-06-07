package academy.devdojo.maratonajava.introducao.aula006estruturasderepeticao;

public class Parte02ExercicioFor {
    public static void main(String[] args) {
        //Exercíco: Imprima todos os números pares de 1 à 1 milhão.
        for (int i=2; i<=1000000;i +=2){
            System.out.println(i);
        }
        //Ou

        for (int i=1; i<=1000000; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}