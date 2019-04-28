import java.util.*;

public class Ex06{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero, i, primo=1;

        System.out.print("Digite um numero: ");
        numero = ler.nextInt();
      

        for(i = 1; i < numero; i++){
            if(numero % i == 0 ){
                primo = 0;
                
            }else if(primo == 1){
              System.out.print(numero);
          }
        }
        
    }
}