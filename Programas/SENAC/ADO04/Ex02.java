
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int nuemro;

			nuemro = ler.nextInt();

			if(nuemro > 0 ){
				System.out.println("Esse numero e positivo"+ nuemro);
			}else{
				System.out.println("Esse numero e negativo"+ nuemro);
			}
    }
    
}