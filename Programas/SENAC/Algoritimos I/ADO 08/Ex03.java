import java.util.*;

public class Ex01{
    public static void main(String[] args) {
        ler = new Scanner(System.in);
        int a, b;

        System.out.print("Didite o primeiro nuemro: ");
        a = ler.nextInt();
               
        numeroParOuImpar(a);
        
    }

    public static numeroParOuImpar( int x){

        if(x < -1){
            System.out.println("Resultado da função: "+(x+2));
        }else if((-1 <= x) || (x <= 2)){
            System.out.println("Resultado da função: "+(Math.pow(x, 2) - 4));
        }else{
            System.out.println("Resultado da função: "+(2* x - 2));

       }
    }
}