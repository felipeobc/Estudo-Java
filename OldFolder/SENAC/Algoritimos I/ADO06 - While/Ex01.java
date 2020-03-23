import java.util.*;

public class Ex01{
  public static void main(String[] args) {
    int [] vetor;
    int i;
    vetor = new int[9];

    for(i = 0; i < vetor.length; i++){
      vetor[i] = 'F';

    }
    for(i = 0; i < vetor.length; i++){
      System.out.println(vetor[i]);
      
    }

  }
}