import java.util.*;

public class Ex04{
  public static void main(String[] args) {
    
    Random numeroRandom = new Random();
    int [] vetor;
    int i, media=0, soma=0;
    vetor = new int[99];

    for(i = 0; i < vetor.length; i++){
      
      vetor[i] = numeroRandom.nextInt();
      
    }
    for(i = 0; i < 9; i++){
      
      media += vetor[i];
      
    }
    
    media = media / 10;
    
    for(i = 0; i < vetor.length; i++){
        
      if(vetor[i] < media){
          
          soma += vetor[i];
        
      }
    }

  }
}