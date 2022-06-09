package academy.devdojo.maratonajava.introducao.aula007arrays;

public class Parte05Multidimencionais {
    public static void main(String[] args) {
        int [][] arrayInt =new int [3][];

        arrayInt [0] = new int [2];
        arrayInt [1] = new int [3];
        arrayInt [2] = new int [6];

        for (int[] arrayBase: arrayInt) {
            System.out.println("\n------");
            for(int num: arrayBase){
                System.out.print(num+ " "); //Quando tirar ln ele não pula linha para dar o resultado.
            }
        }

        int[][] arraySegundo = new int [3][];

        arraySegundo [0] = new int []{15,16,18};
        arraySegundo [1] = new int []{1,2,3,4};
        arraySegundo [2] = new int []{0,2,4,6,8};

        for (int[] arrayBase2: arraySegundo) {
            System.out.println("\n------");
            for(int num: arrayBase2){
                System.out.print(num+ " ");
            }
        }

        //Forma3
        int [][] arrayInt2 = {{9, 7}, {12, 15, 17}, {20, 25, 29, 24}};

        for (int[] arrayBase3: arrayInt2) {
            System.out.println("\n------");
            for(int num: arrayBase3){
                System.out.print(num+ " ");
            }
        }
    }
}
