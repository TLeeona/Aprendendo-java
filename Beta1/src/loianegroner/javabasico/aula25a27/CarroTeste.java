package loianegroner.javabasico.aula25a27;

public class CarroTeste {
    public static void main(String[] args) {

        Carro van = new Carro(); //Declaração de uma váriavel Van.
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia(); //Chamar o método exibirAutonomia "para que ele possa executar o que tem nele".

        System.out.println("__________________________________________");
        //Agora chamamos o retorno para dentro de uma váriavel e imprimimos ou já imprimimos o retorno.
        //Opção 1
        double autonomia = van.obterAutonomia(); //chamando o retorno do método obterAutonomia para uma variável.
        System.out.println("A autonomia do carro é: "+autonomia);
        //Opção 2
        System.out.println(van.obterAutonomia()+" é a autonoma do carro"); //imprimir o retorno direto.

        System.out.println("__________________________________________");

        //Quanto de combustível precisariamos para a Van andar 10 e 15 km?
        double quantidadeCombsutivel10 = van.calcularCombustivel(10); //Agora ele pede a distância.
        double quantidadeCombsutivel15 = van.calcularCombustivel(15); //Agora ele pede a distância.
        System.out.println("Quantidade de combústivel para percorrer 10km = " + quantidadeCombsutivel10);
        System.out.println("Quantidade de combústivel para percorrer 15km = " + quantidadeCombsutivel15);
    }
}