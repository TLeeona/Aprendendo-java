package academy.devdojo.maratonajava.introducao.aula004operadores;

public class Parte04Atribuicao {
    public static void main(String[] args) {
        /* Operadores de Atribuição - Atribuiem, adicionam, algo a variável e ajudam a resumer os codigos.
        Eles são: =, +=, -=, *=, /= e %=.
         */
        double totalVisualizadoNaTelaDaCalculadora = 0;
        totalVisualizadoNaTelaDaCalculadora += 147; //Nesse ponto o total é 147
        totalVisualizadoNaTelaDaCalculadora -= 26; //Nesse ponto o total é 121
        totalVisualizadoNaTelaDaCalculadora *= 4; // Nesse ponto o total é 484
        totalVisualizadoNaTelaDaCalculadora /= 2;
        System.out.println("Total Calculado é " +totalVisualizadoNaTelaDaCalculadora);

        //Existe uma simplificação que é adicionada para repetir ++ e --
        int pessoasDentroDoOnibus = 1; // Iniciou com 1 pessoa.
        pessoasDentroDoOnibus += 1; // Entrou 1 pessoa. Total 2.
        pessoasDentroDoOnibus ++; // Entrou 1 pessoa. Total 3.
        System.out.println("Total de pessoas dentro do onibus "+pessoasDentroDoOnibus);
        pessoasDentroDoOnibus ++; // Entrou 1 pessoa. Total 4.
        pessoasDentroDoOnibus --; // Saiu 1 pessoa. Total 3.
        pessoasDentroDoOnibus ++; // Entrou 1 pessoa. Total 4.
        pessoasDentroDoOnibus ++; // Entrou 1 pessoa. Total 5.
        System.out.println("Total de pessoas dentro do onibus "+pessoasDentroDoOnibus);

        //A posição do +/- interfere. Ex.:
        int contador = 0;
        contador += 1;
        System.out.println(contador++); //Aqui eu estou dizendo para o codico para mostrar o restado antes.
        System.out.println(contador); //Aqui ele vai adicionai o ++ citado acima.
        System.out.println(--contador); //Aqui ele vai subtrair primeiro e depois mostrar o resultado.
    }
}
