import java.util.*;

public class Ex02{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int [] vetor;
    int i, media=0;
    vetor = new int[5];

    for(i = 0; i < vetor.length; i++){
      
      vetor[i] = ler.nextInt();
      
    }
    for(i = 0; i < vetor.length; i++){
      
      media += vetor[i];
      
    }
    
    media = media / 5;
    
    for(i = 0; i < vetor.length; i++){
        
      if(vetor[i] > media){
          
          System.out.println(vetor[i]);
        
      }
    }

  }
}