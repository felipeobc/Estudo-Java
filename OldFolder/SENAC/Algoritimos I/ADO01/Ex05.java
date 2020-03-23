
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int numero01, soma;

            numero01 = ler.nextInt();
            

            if(numero01 > 100 ){
                soma = numero01 + 150;
                System.out.print("Mais 150 a esse numero: "+ soma);
                
            } else{
                System.out.println("O numero é meno que 100! ");
            }
				
			
    }
    
}