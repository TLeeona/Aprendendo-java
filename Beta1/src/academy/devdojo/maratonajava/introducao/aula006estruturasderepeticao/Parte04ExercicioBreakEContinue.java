package academy.devdojo.maratonajava.introducao.aula006estruturasderepeticao;

public class Parte04ExercicioBreakEContinue {
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
        //Exercício de Continue
        double novoValorDoCarro = 30000;
        for (int novaParcela = (int) novoValorDoCarro; novaParcela >=1; novaParcela--){
            double valorDaNovaParcela = novoValorDoCarro / novaParcela;
            if (valorDaNovaParcela < 1000){
                continue;
            }
            System.out.println ("Nova Parcela "+ novaParcela + " R$ " +valorDaNovaParcela);
        }
    }
}