package loianegroner.javabasico.aula25a27;

public class Lampada {
    //Exercício 01

    String desligarLampada (Boolean statusDaLampada){
        if (statusDaLampada.equals(true)){
            return "A lâmpada foi desligada";
        }
        return "A lâmpada permanece desligada";
    }
    String ligarLampada (Boolean statusDalampada){
        if (statusDalampada.equals(false)){
            return "A lâmpada foi ligada";
        }
        return "A lâmpada permanece ligada";
    }
}
