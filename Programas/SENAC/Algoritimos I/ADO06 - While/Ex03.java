import java.util.*;

public class Ex03{
  public static void main(String[] args) {
    Random numero = new Random();
    int [] vetor;
    int i;
    vetor = new int[99];

    for(i = 0; i < vetor.length; i++){
      vetor[i] = numero.nextInt();

    }
    for(i = 0; i < vetor.length; i++){
      System.out.println(vetor[i]);
      
    }

  }
}