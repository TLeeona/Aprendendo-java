package academy.devdojo.maratonajava.introducao.aula006estruturasderepeticao;

public class Parte03Break {
    public static void main(String[] args) {
        //Parando loop de repetição.
        //Imprima os primeiros 25 nuúmeros de um dado valor. Por exemplo, 50.
        int valorMax = 50;
        for (int i = 0;i<= valorMax;i++){
            if(i>=25){
                break;
            }
            System.out.println(i);
        }
    }
}