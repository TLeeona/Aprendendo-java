package academy.devdojo.maratonajava.introducao.aula005estruturascondicionais;

public class Parte06Exercicio {
    public static void main(String[] args) {
        // Exercício: Dados os valores de 1 à 7, imprima se é dia útil ou final de semana. Considerando 1 como Domingo.

        byte diaDaSemana = 9;
        String imprima;
        switch (diaDaSemana){
            case 1:
                imprima = "Fim de semana";
                break;
            case 2:
                imprima = "Dia útil";
                break;
            case 3:
                imprima = "Dia útil";
                break;
            case 4:
                imprima = "Dia útil";
                break;
            case 5:
                imprima = "Dia útil";
                break;
            case 6:
                imprima = "Dia útil";
                break;
            case 7:
                imprima = "Fim de semana";
                break;
            default:
                imprima = "Erro! Uma semana só tem 7 dias.";
                break;
        }
        System.out.println(imprima);

        //Simplificando
        byte dia = 1;
        switch (dia){
            case 1:
            case 7 :
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Uma semana só tem 7 dias");
                break;
        }

    }
}
