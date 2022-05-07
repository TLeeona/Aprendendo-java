package academy.devdojo.maratonajava.introducao;

/**
 * Exercício
 * Crie variáveis para os campos decritos abaixo entr <> e imprima a seguinte mensagem:
 * Eu <nome>, morando no endereço <endereço> confirmo que recebi o salário de <salario>, na data <data>.
 */
public class ExercicioTiposPrimitivos {
    public static void main(String[] args) {
        String name = "Leeona Taufner";
        String street = "Rua dos Programadores";
        byte houseNumber = 13;
        String district = "Boa Viagem";
        String city = "Recife";
        char firstLetterAcronymState = 80;
        char secondLetterAcronymState = 69;
        char symbolReal = 82;
        char symbolMoney = 36;
        float salario = 1260.59f;
        byte day = 30;
        byte month = 4;
        short year = 2022;

        System.out.println("Eu "+name+", morando no endereço "+street+", nº"+houseNumber+", "+district+", "+city+
                "-"+firstLetterAcronymState+secondLetterAcronymState+" confirmo que recebi o salário de "+symbolReal+
                symbolMoney+salario+", na data "+day+"/"+month+"/"+year+".");
    }
}
