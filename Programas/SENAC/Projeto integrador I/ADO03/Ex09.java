import java.util.Scanner;

 public class Ex09{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero1, numero2;
        double num1, num2;
        String nu1, nu2;

        System.out.print("Int Num1: ");
        numero1 = ler.nextInt();
        System.out.print("Int Num2: ");
        numero2 = ler.nextInt();

        System.out.print("Decimal Num1: ");
        num1 = ler.nextDouble();
        System.out.print("Decimal Num2: ");
        num2 = ler.nextDouble();
        
        System.out.print("Texto Num1: ");
        nu1 = ler.next();
        System.out.print("Texto Num2: ");
        nu2 = ler.next();

        System.out.println("Numeros Inteiros, Decimal e Texto: "+numero1+ "; " +numero2+ "; " +num1+ "; " +num2+"; " +nu1+ "; " +nu2);
        
        
        
        
    }
}