import java.util.Scanner;

 public class Ex13{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nota1, nota2;
        

        System.out.print("Nota do 1 Bimestre: ");
        nota1 = ler.nextDouble();
        System.out.print("Nota do 2 Bimestre: ");
        nota2 = ler.nextDouble();
       

        System.out.println("Nota Final: " + ((nota1*2 + nota2*3) / 5));
        
                
        
    }
}