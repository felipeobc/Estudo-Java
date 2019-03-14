import java.util.Scanner;

 public class Ex11{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int A, B, i;
        

        System.out.print("A: ");
        A = ler.nextInt();
        System.out.print("B: ");
        B = ler.nextInt();

        
        System.out.println("Soma: " + (A + B));
        System.out.println("Subtração: " + (A - B));
        System.out.println("Prduto: " + (A * B));
        System.out.println("Divisão: " + (A / B));
        System.out.println("Resto: " + (A % B));
                
        
    }
}