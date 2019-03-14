import java.util.Scanner;
import java.lang.*;

 public class Ex17{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero1, numero2, resto ;
        boolean x;


        System.out.print("Digie um Numero: ");
        numero1 = ler.nextInt();
        System.out.print("Digie um Numero: ");
        numero2 = ler.nextInt();

        x = numero1 == numero2;
        System.out.println("Se são iguais: "+ x);
        x = numero1 != numero2;
        System.out.println("Se são diferentes: "+ x);
        x = numero1 > numero2;
        System.out.println("Se o primeiro é maior que o segundo: "+ x);
        x = numero1 < numero2;
        System.out.println("Se o segundo é maior que o primeiro: "+ x);
        x = numero1 < 0;
        System.out.println("Se o primeiro é negativo: "+ x);
        x = numero2 < 0;
        System.out.println("Se o Segundo é negativo: "+ x);
        resto = numero1 % numero2;
        x = resto > 0;
        System.out.println("Se o Segundo é negativo: "+ x);
        
        
    }
}