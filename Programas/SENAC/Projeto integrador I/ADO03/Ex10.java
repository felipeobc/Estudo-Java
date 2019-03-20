import java.util.Scanner;

 public class Ex10{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int A, B, i;
        

        System.out.print("A: ");
        A = ler.nextInt();
        System.out.print("B: ");
        B = ler.nextInt();

        i = A;
        A = B;
        B = i;
        
        System.out.println("Valores de A e B invertidos: "+A+ " e " +B);
        
        
        
        
    }
}