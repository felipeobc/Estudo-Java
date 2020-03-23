import java.util.*;

public class Ex03{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero01, numero02, x;

        numero01 = ler.nextInt();
        numero02 = ler.nextInt();
     
        if(numero01 > 0 && numero02 > 0){
            x = numero01 + numero02;
        }else{
            x = numero01 - numero02;
        }

        if(x < -100 || x < 100 ){
            System.out.println("Não é centena");
        }else{
            System.out.println("É centena ou maior/menor");
        }
    }
}