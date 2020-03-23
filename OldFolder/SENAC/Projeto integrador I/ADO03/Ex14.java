import java.util.Scanner;

 public class Ex14{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b, h;
        

        System.out.print("lado a: ");
        a = ler.nextInt();
        System.out.print("Lado b: ");
        b = ler.nextInt();
        System.out.print("Altura h: ");
        h = ler.nextInt();
       

        System.out.println("Area do Trapezio: " + (((a + b) / 2) * h ));
        
                
        
    }
}