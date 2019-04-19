import java.util.*;

public class Ex03{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Random random = new Random(); 

    int i=0, Numero, numeroAleatorio;
    numeroAleatorio = random.nextInt(10);

    while(i == 0){
      System.out.print("Digite um numero inteiro entre  1 a 10:  ");
      Numero = ler.nextInt();

      if(numeroAleatorio == Numero ){
        System.out.print("Parabens voce acertou!!!");
        i=1;
      }else if(Numero > numeroAleatorio){
        System.out.println("Tente um numero menor");
        
      }else{
        System.out.println("Tente um numero maior");
      }

    }
  }
}