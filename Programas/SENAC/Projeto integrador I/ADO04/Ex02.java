import java.util.Scanner;
public class Ex02{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero01;

        numero01 = ler.nextInt();

        if(numero01 % 2 == 0){
            System.out.println("Esse numero é par");
        }else {
            System.out.println("Esse nuemero é impar");           
        }

    }
}