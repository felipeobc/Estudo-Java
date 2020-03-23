import java.util.*;

public class Ex01{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    String palavra;
    int i=0;

    while(i == 0){
      System.out.print("Digite uma palavra com 6 caractere: ");
      palavra = ler.nextLine();

      if(palavra.length() < 6){
        System.out.print("Numero de caracteres incorreto digite novamente!");

      }else if(palavra.length() == 6){
        System.out.println("Parabens voce acertou :) sua palavra foi: "+ palavra);
        i = 1;
      }

    }
  }
}