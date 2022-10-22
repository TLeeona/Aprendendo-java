package loianegroner.javabasico.aula25a27;

public class Carro {
    //Atributos da classe. Nesse exemplo são 5 atributos. Regra de etiqueta: os atributos devem vir antes dos métodos.
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    //Método. Para começar, deve se declara qual é o tipo retorno. Regra de etiqueta: o nome do método devo começar com
    // um verbo
    void exibirAutonomia (){ //Void é vazio, nada. Ele não vai retornar nenhum valor.
        System.out.println("A autonomia do carro é: "+ capacidadeCombustivel * consumoCombustivel + "km"); //Essa
        // mensagem não é um retorno, mas sim apenas uma mensagem executado pelo método.
    }

    //Método com retorno. Em vez de apenas exibir diretamente a mensagem na tela, como o exemplo acima com o void, o
    //método com retorno vai dar a informação e a partir dessa informação obtida é que o teste vai exibir a mensagem.
    double obterAutonomia (){ // Como falado acima, deve-se declarar qual é o tipo de retorno. O tipo da informação que
        //queremos que retorne é do tipo double. Vamos multiplicar a capacidade de combústivel com o consumo, e o valor
        //desses dois atributos são double, por isso usamos declarar double.
        System.out.println("Método obterAutonomia foi chamado");
        return capacidadeCombustivel * consumoCombustivel; //No final do método deve-se colocar return com a informação
        //que queremos que retorne.
    }

    //Método com parâmetro
    //Quando se faz necessário um parâmetro? Quando você precisa de uma informação que não está na classe. Pode ser
    //usado qualquer tipo de retorno.
    double calcularCombustivel (double distanciaAPercorrer){ //Para calcularmos a quantidade de combustível para uma determinada
        //distância, precisamos da distância e do consumo. O consumo já foi informado, mas a distânica
        //não. Então colocaremos a distânica como paramêtro (Logo, a distância precisarar ser informada na "aba de
        //teste").
        double quantidadeCombsutivel = distanciaAPercorrer/consumoCombustivel;
        return quantidadeCombsutivel;
    }
}