import java.util.Scanner;
import java.lang.*;

 public class Ex19{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero1, numero2;
        boolean x;


        System.out.print("Digie um Numero: ");
        numero1 = ler.nextInt();
        System.out.print("Digie um Numero: ");
        numero2 = ler.nextInt();

        x = numero1 > numero2;

        
        
        System.out.println("Numero 1 é: "+ x);
        
        
    }
}