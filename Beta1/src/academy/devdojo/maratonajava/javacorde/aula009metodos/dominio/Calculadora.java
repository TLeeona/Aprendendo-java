package academy.devdojo.maratonajava.javacorde.aula009metodos.dominio;

public class Calculadora {
    public void somarDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(21 - 15);
    }

    //Parâmetros
    public void multiplicarNumeradorEDenominador(int numerador, int denominador) {
        //Pode inserir mais parâmetros. Dica de "etiqueta". Uma função com 3 ou mais argumentos (é deselegante kkkkkkk) significa que o metodo está fazendo "muita coisa".
        System.out.println(numerador * denominador);
    }

    //Retorno
    public double dividirNumeradorPeloDenominador(double numerador, double denominador){
        if (denominador == 0){
            return 0;
        }
        return numerador/denominador; //Esse retorno pode ser colocado no Else, mas fica redundante.
    }
    //retorno com Else
    public double dividirNumeradorPeloDenominador02 (double numerador02, double denominador02) {
        if (denominador02 != 0) {
            return numerador02 / denominador02;
        }
        return 0;
    }
    public void dividirNumeradorPeloDenominador03 (double numerador03, double denominador03) {
        //Quando você coloca void, significa vázio. Então você não consegue obter retorno. Para impedir o Zero, pode imprimir algo.
        if (denominador03 == 0) {
            System.out.println ("Não existe divizção por 0");
        }else {
            System.out.println(numerador03/denominador03);
        }
    }
}