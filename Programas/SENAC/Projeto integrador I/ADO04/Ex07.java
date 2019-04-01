import java.util.Scanner;
public class Ex07{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero01, numero02;

        numero01 = ler.nextInt();
        numero02 = ler.nextInt();

        if(numero02 == 0){
            System.out.println("Não  exite numero divido por 0");
        }else{
            System.out.println("Numeros negativos: "+(numero01 / numero02));
        }

    }
}