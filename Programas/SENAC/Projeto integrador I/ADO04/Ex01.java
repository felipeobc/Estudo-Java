import java.util.Scanner;
public class Ex01{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero01;

        numero01 = ler.nextInt();

        if(numero01 == 0){
            System.out.println("Numero é igual a 0 ");
        }else if(numero01 > 0){
            System.out.println("Numero é maior que 0");           
        }else{
            System.out.println("Numero é menor a 0 ");
        }

    }
}