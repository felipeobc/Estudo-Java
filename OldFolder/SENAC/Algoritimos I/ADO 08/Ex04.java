import java.util.*;

public class Ex04{
    public static void main(String[] args) {
        ler = new Scanner(System.in);
        int a, b;

        System.out.print("Didite um nuemro: ");
        a = ler.nextInt();
               
        ePrimo(a);
        
    }

    public static ePrimo( int primo){
		boolean isPrimo = true;
		int divisor = 0;
		for (int i = 2; i <= primo; i++) {
			if ( ( (primo % i) == 0) && (i != primo) ) {
				isPrimo = false;
				divisor = i;
				break;
			}
		}
		if (isPrimo) {
			System.out.println( "é Primo" );
		} else {
			System.out.println( "Não é Primo --> " + divisor );
		}
    }
}

