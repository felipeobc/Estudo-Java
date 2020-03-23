import java.util.Scanner;

public class Ex19{
  public static void main(String[] arg){
    Scanner ler = new Scanner(System.in);

    int numero01, numero02, a;

    System.out.print("Digiteo numero 1: ");
    numero01 = ler.nextInt();

    System.out.print("Digiteo numero 2: ");
    numero02 = ler.nextInt();

    a = (numero01 / numero02) * 100;

    System.out.println("O numero 1 e "+a+"% do numero 2");
    
  }
}