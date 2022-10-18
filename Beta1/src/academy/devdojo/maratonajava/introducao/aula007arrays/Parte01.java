package academy.devdojo.maratonajava.introducao.aula007arrays;

public class Parte01 {
    public static void main(String[] args) {
        //Caso você queira guardar e imprimir 3 idades, como faria?
        int idade01 = 15;
        int idade02 = 20;
        int idade03 = 21;
        System.out.println("Forma antiga " +idade01);
        System.out.println("Forma antiga " +idade02);
        System.out.println("Forma antiga " +idade03);

        //Arrays são referencias a um espaço de memória que pode conter uma ou mais informações. Exemplo: Como o exemplo
        // acima, você precisou alorcar 3 informações diferentes em 3 espaços de memária diferentes. O Arrays faz com
        // que você possa acessar um mesmo espaço de memória contendo 1 ou mais informações.

        int [] idades01 = null; //Arrays não é um tipo primitivo e sem de referencia, então ele "altera" o int, fazendo
        // com que ele aceito o null.
        System.out.println("Idade nula " +idades01);

        int [] idades05 = new int[3]; //É necessário informar quantos espações você quer dentro daquela memória. Nesse
        // caso, é o valor 3, quie colocarmos no [], apois new int.
        //Existem posições para colocar as informções, começando pelo 0. Então, a informação 1 vai ficar alocada na
        // posição 0, a informação 2 vai ficar na posição 1 e assim sucessivamente. CUIDADO! VAI FICAR CONFUSO.
        idades05 [0] = 45;
        idades05 [1] = 72;
        idades05 [2] = 16;
        //Caso você coloque uma posição a mais do que foi informado no "new int [3]" ou imprimir uma posição quie não
        // existe, vai dar uma erro de copilação.

        System.out.println("Idade usando Arrays " +idades05); //Para imprimir a posição desejada é só colocar o nome da
        // variável em seguida [] e dentro o número da posição. Caso contaria ele vai imprimeir o endereço de momémoria
        // que esse arrays está armazenado.
    }
}
