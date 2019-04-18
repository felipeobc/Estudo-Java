import java.util.*;

public class Ex07{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero, i, primo=1;

        System.out.print("Digite um numero: ");
        numero = ler.nextInt();
        i = 1;

        while(i < numero){
            if(numero % i == 0 ){
                primo = 0;
                break;
            }
            i++;
        }
        if(primo == 1){
            System.out.print("Esse numero é Primo");
        }else{
            System.out.print("Esse numero não é primo");
        }
    }
}