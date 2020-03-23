import java.util.Scanner;
import java.lang.*;

 public class Ex18{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero1, numero2, soma ;
        boolean x;


        System.out.print("Digie um Numero: ");
        numero1 = ler.nextInt();
        System.out.print("Digie um Numero: ");
        numero2 = ler.nextInt();

        soma = numero1 + numero2;

        x = soma >= 100;
        
        
        System.out.println("Numero é: "+ x);
        
        
    }
}