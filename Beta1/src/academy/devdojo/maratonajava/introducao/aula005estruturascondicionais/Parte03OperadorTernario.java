package academy.devdojo.maratonajava.introducao.aula005estruturascondicionais;

public class Parte03OperadorTernario {
    public static void main(String[] args) {
        // Operador Ternário - Criado para simplificar condições de If e Else.

        double salarioDeGabriel = 5000;
        String mensagemDoarGabriel = "Eu, Gabriel, vou doar R$500,00 para o DevDojo.";
        String mensagemNaoDoarGabriel = "Eu, Gabriel, ainda não tenho condições de doar, mas vou ter!";
        String mensagemDeRespostaDoGabriel;

        if (salarioDeGabriel>5000){ //Jeito antigo de fazer
            mensagemDeRespostaDoGabriel = mensagemDoarGabriel;
        }else {
            mensagemDeRespostaDoGabriel = mensagemNaoDoarGabriel;
        }
        System.out.println(mensagemDeRespostaDoGabriel);

        //Novo jeito, com o operador ternário. Sintaxe do operador ternário (condicao) ? verdadeiro : falso
        double salarioDeTulipa = 6250;
        String mensagemDoarTulipa = "Eu, Tulipa, vou doar R$500,00 para o DevDojo.";
        String mensagemNaoDoarTulipa = "Eu, Tulipa, ainda não tenho condições de doar, mas vou ter!";
        String mensagemDeRespostaDeTulipa = salarioDeTulipa > 5000 ? mensagemDoarTulipa : mensagemNaoDoarTulipa;
        //O ternaria precisa guardar o resultado.
        System.out.println(mensagemDeRespostaDeTulipa);

        //Simplificando ainda mais essa ação.
        double salarioDeMargarida = 7000;
        String mensagemDeMargarida = salarioDeMargarida > 5000 ? "Eu, Margarida, vou doar R$500,00 para o DevDojo." :
                "Eu, Margarida, ainda não tenho condições de doar, mas vou ter!";
        System.out.println(mensagemDeMargarida);

        //Usar ternário com mais de 2 condições, mas não deve ser usados por que deixa confuso e complicado.
        int notaDaProvaDeRamona = 9;
        String mensagemSobreANotaDaProva = notaDaProvaDeRamona >=8 ? "Parabéns pela excelente nota" :
                notaDaProvaDeRamona <8 && notaDaProvaDeRamona >= 6 ? "Parabéns pela nota" : "Infelizmente não foi dessa vez";
        System.out.println(mensagemSobreANotaDaProva);
    }
}
