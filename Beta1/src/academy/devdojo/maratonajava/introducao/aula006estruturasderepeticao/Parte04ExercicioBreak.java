package academy.devdojo.maratonajava.introducao.aula006estruturasderepeticao;

public class Parte04ExercicioBreak {
    public static void main(String[] args) {
        //Dado o valor de um carro, decubra em quantas vezes ele pode ser parcelado.
        //Condição valar das parcelas >=1000.

        double valorDoCarro = 30000;
        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valorDaParcela = valorDoCarro / parcela;
            if (valorDaParcela < 1000) {
                break;
            }
            System.out.println ("Parcela "+ parcela + " R$ " +valorDaParcela);
        }
    }
}