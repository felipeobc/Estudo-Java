import java.util.Scanner;
import java.lang.*;

 public class Ex17{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int Numero;
        boolean x;


        System.out.print("Digie um Numero: ");
        Numero = ler.nextInt();
        
        x = Numero >=0;
        
        
        System.out.println("Numero é: "+ x);
        
        
    }
}