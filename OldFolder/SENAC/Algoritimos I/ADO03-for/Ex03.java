import java.util.*;

public class Ex03{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int i, num, soma=0;

    for(i=0; i < 10; i++){
      System.out.print("Digiteo "+(i++)+" Numero: ");
      num = ler.nextInt();

      soma +=  num;
    }
    System.out.println("A soma dos 10 numeros: "+ soma);
    

  }
}