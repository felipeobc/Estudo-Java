import java.util.Scanner;

 public class Ex12{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double raio;
        

        System.out.print("Digite o Raio do Circulo: ");
        raio = ler.nextDouble();
       

        System.out.println("Area do Circulo: " + (3.14 * Math.pow(raio, 2)));
        
                
        
    }
}