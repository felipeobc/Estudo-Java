import java.util.*;

public class Ex04{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int i, num;

    System.out.printf("Digite um numero: ");
    num = ler.nextInt();

    for(i = num; i > 0; i--){
      if(num % i == 0){
        System.out.println(i);
      }
    }

  }
}