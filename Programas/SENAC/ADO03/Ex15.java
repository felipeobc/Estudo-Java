import java.util.Scanner;
import java.lang.*;

 public class Ex15{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double a;
        

        System.out.print("Numero: ");
        a = ler.nextDouble();
       
       

        System.out.println("A pontecia do numero: " + Math.pow(a, 2));
        System.out.println("A Raiz do numero: " + Math.sqrt(a)); 

                
        
    }
}