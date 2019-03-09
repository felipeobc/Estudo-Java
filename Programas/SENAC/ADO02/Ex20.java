import java.util.Scanner;

public class Ex20{
  public static void main(String[] arg){
    Scanner ler = new Scanner(System.in);

    int numero01, numero02;

    System.out.print("Digiteo numero 1: ");
    numero01 = ler.nextInt();

    System.out.print("Digiteo numero 2: ");
    numero02 = ler.nextInt();

    System.out.println("O valor oposto do segundo número: "+ (numero02 - Math.pow(numero02,2)));
    
    System.out.println("A diferença do primeiro número com o segundo "+ (numero01 - numero02));
    System.out.println("O primeiro valor elevado ao segundo valor"+ (Math.pow(numero01, numero02)));
    System.out.println("A soma do segundo número com a metade do primeiro número"+ (numero02 +(numero01/2)));
    System.out.println("O primeiro valor vezes o segundo valor"+ (numero01 * numero02));

  }
}