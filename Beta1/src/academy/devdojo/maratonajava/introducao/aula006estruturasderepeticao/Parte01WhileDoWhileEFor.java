package academy.devdojo.maratonajava.introducao.aula006estruturasderepeticao;

public class Parte01WhileDoWhileEFor {
    public static void main(String[] args) {
        //O nome já diz, é repetição, como um contado ininito.
        // Basicamente são 3 estruturas de repetição: while, do while e for.

        int contador = 0;
        while(contador < 10) {
            System.out.println(contador);
            contador += 1;
        }
        //Diferença entre While e Do while é que caso a senteça for falsa, o while não vai rodar. Já o Do while roda pelo menos uma vez, mesmo sendo falso.
        contador = 0;
        do{
            System.out.println("dentro do do-while"+contador);
            contador +=2;
        }while(contador < 10);

        //Caso você tenha apenas uma insetrução dentro deles, não precisa usar chaves.
        //No for você trabalha com indeces, já no while e do while você pode colocar condição.
        // For tem 3 partes. Na 1º parte é a variável que vai ser incrementada.
        //2º parte - Fazer a comparação até onde você quer que a repetição seja executada.
        //3º parte - Como essa variável vai alterar o status.
        for(int i = 0; i<10; i++){//É um padrão nomear a variável de i.
            // 1º Problema i é uma váriavel está sendo declarada localmente. Variáveis locais precisam ser inicializada antes de utilizar
            System.out.println("for "+i);
        }
    }
}