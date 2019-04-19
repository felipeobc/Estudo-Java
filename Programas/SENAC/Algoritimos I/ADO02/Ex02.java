import java.util.*;

public class Ex02{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int i=0, Numero;

    while(i == 0){
      System.out.print("Digite um numero inteiro:  ");
      Numero = ler.nextInt();

      if(Numero > 0 ){
        System.out.print("O numero não é Perfeito");

      }else{
        System.out.println("Parabens voce acertou :) Seu numero é perfeito: "+ Numero);
        i = 1;
      }

    }
  }
}