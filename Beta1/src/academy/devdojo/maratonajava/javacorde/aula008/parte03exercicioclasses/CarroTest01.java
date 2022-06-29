package academy.devdojo.maratonajava.javacorde.aula008.parte03exercicioclasses;

public class CarroTest01 {
    public static void main(String[] args) {
        CarroDominio carro01 = new CarroDominio();
        carro01.nome = "Tutubarão";
        carro01.modelo = "Megane";
        carro01.ano = 2010;

        CarroDominio carro02 = new CarroDominio();
        carro02.nome = "Branquinho";
        carro02.modelo = "Corsa Classic";
        carro02.ano = 2008;

        System.out.println("Carro 01");
        System.out.println("Nome: " + carro01.nome + ". Modelo: " + carro01.modelo + ". Ano: " +carro01.ano + ".");

        System.out.println("\n Carro 02");
        System.out.println("Nome: " + carro02.nome + ". Modelo: " + carro02.modelo + ". Ano: " +carro02.ano + ".");
    }
}
