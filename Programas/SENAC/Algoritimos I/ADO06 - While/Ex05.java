import java.util.*;

public class Ex05{
  public static void main(String[] args) {
    
    Random numeroRandom = new Random();
    int [] vetor;
    int i;
    vetor = new int[99];

    for(i = 0; i < vetor.length; i++){
      
      vetor[i] = numeroRandom.nextInt();
      
    }
    for(i = 0; i < vetor.length; i++){
      
      if(vetor[i] / 10 == 0){
        System.out.println(vetor[i]+ " ");
      }else{
        System.out.print(vetor[i]+ " ");
      }
      
    }
      
    

  }
}