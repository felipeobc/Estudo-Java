
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int numero01, numero02;

            numero01 = ler.nextInt();
            numero02 = ler.nextInt();

            if(numero01 % numero02 == 0){
                System.out.println("A divisão de" +numero01+  " por "  +numero02+ "é exata");
                
            }else{
                System.out.println("Essa divisao nao é exata");
            }
			
    }
    
}