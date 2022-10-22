package loianegroner.javabasico.aula25a27;

public class LampadaTeste {
    public static void main(String[] args) {

        Lampada statusDaLampada = new Lampada(); //True = lâmpada ligada e False = lâmpada desligada
        String situacao01 = statusDaLampada.desligarLampada(true);
        String situacao02 = statusDaLampada.desligarLampada(false);
        System.out.println("A Lâmpada foi desligada? "+situacao01);
        System.out.println("A Lâmpada foi desligada? "+situacao02);
        System.out.println("________________________________");

        String situacao03 = statusDaLampada.ligarLampada(false);
        String situacao04 = statusDaLampada.ligarLampada(true);
        System.out.println("A Lâmpada foi ligada? "+situacao03);
        System.out.println("A Lâmpada foi ligada? "+situacao04);



    }
}
