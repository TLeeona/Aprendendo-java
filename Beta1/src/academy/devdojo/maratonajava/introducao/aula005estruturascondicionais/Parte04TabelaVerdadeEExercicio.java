package academy.devdojo.maratonajava.introducao.aula004operadores;

public class Parte03TabelaVerdadeEExercicio {
    public static void main(String[] args) {
/*Tabala Verdade - é o que vai definir o que se tem como resultado de um experessão boaleana quando se
*tem mais de uma condição.
*E/and (&&) - todas as expressões dessa tabela precisa ser verdadeira para que o resultado final seja
*verdadeiro.
*V && V = V
*V && F = F
*F && V = F
*F && F = F
*V && V && V && V && V && F = F
*Ou/or (||) - Desta tabela, o resultado só vai ser falso se todas as expressões forem falsas.
*V && V = V
*V && F = V
*F && V = V
*F && F = F
*F && F && F && F && F && V = V
*/

/*Exercício - Dado um determinado salário, eu quero saber qual o valor que eu tenho que pagar.
*$0 à 34,712 - 9,70%
*$34,713 à 68,507 - 37,55%
Acima de 68,508 - 49,50%
*/
        float salarioDaPessoaA = 0f;
        String impostoAPagar;
        
        if (isSalarioDaPessoaA >= 0 && <= 34.712){
            impostoAPagar = "9,70%";
        } else if (isSalarioDaPessoaA >= 34.713 && <= 68.507){
            impostoAPagar = "37,55%";
        } else{
            impostoAPagar = "49,50%";
        }
        System.out.println (impostoAPagar);
    }
}
