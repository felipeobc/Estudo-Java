
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int numero01, numero02;

            numero01 = ler.nextInt();
            numero02 = ler.nextInt();

			if(numero01 > numero02 ){
				System.out.println(numero01 +" é maior");
			}else{
				System.out.println(numero02 +" é maior");
			}
    }
    
}