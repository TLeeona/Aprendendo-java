package academy.devdojo.maratonajava.introducao.aula007arrays;

public class Parte04Multidimencionais {
    public static void main(String[] args) {
        //Arrays multidimencionais são arrays de arrays. kkkk Arrays lincados a outros arrays.
        //Para criar arrays multidimencionais é só adicionair mais cochetes "[]".
        int [][] dias = new int [3][3];
        dias[0][0] = 8;
        dias[0][1] = 4;
        dias[0][2] = 3;

        dias[1][0] = 15;
        dias[1][1] = 17;
        dias[1][2] = 13;

        for (int i = 0; i < dias.length; i++) { //Se imprimir só assim, só vai mostrar o enderaço onde estão os arrays do [0] e [1].
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        //Usando o Foreach.
        for (int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println("Foreach " +num);
            }
        }
    }
}
