package academy.devdojo.maratonajava.introducao.aula005estruturascondicionais;
class Parte05Switch {
  public static void main(String args[]) { 
   //Switch - Funcionalidade que organiza quando for necessario usar condicionais simples para escolhas.
    //Imprima o dia da semana, considerando 1 como domingo.

    //Forma antiga
    byte dia =9;
    if (dia == 1){
      System.out.println ("Domingo");
      }else if(dia == 2){
      System.out.println ("Segunda");
      }else if(dia == 3){
      System.out.println ("Terça");
      }else if(dia == 4){
      System.out.println ("Quarta");
      }else if(dia == 5){
      System.out.println ("Quinta");
      }else if(dia == 6){
      System.out.println ("Sexta");
      }else if(dia == 7){
      System.out.println ("Sábado");
      }else {
      System.out.println ("Erro!");
      }

    //Nova forma
    byte novoDia = 10; 
    //Variáveis que voCê pode utilizar são: char, int, byte, short, enum, String. Se colocar doublo ou float vai dar erro.
    switch (novoDia){
      case 1:
        System.out.println ("Domingo");
        break;//É necessario colocar a palavra breaf para parar, pois assim que ele encontrar o número do "novoDia", ele vai imprimir o que vem depois também.
      case 2:
        System.out.println ("Segunda");
        break;
      case 3:
        System.out.println ("Terça");
        break;
      case 4:
        System.out.println ("Quarta");
        break;
      case 5:
        System.out.println ("Quinta");
        break;
      case 6:
        System.out.println ("Sexta");
        break;
      case 7:
        System.out.println ("Sábado");
        break;
      //Caso você colocque algum valor que não foi mencionado nos case, ele não vai imprimir nada. Para isso, você pode colocar a opção default (não precisa ser na última linha).
      default:
        System.out.println ("Opção Inválida");
    
    }
    char sexo = 'M';
    switch(sexo){
      case 'M':
        System.out.println ("Homem");
        break;
      case 'F':
        System.out.println ("Mulher");
        break;
      default:
        System.out.println ("Inválido");
        break;
    }
  } 
  
}
