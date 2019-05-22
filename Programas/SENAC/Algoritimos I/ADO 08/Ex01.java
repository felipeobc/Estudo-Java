import java.util.*;

public class Ex01{
    public static void main(String[] args) {
        ler = new Scanner(System.in);
        int a, b;

        System.out.print("Didite o primeiro nuemro: ");
        a = ler.nextInt();
        System.out.print("Didite o segundo nuemro: ");
        b = ler.nextInt();
        
        maiorNumero(a,b);
        
    }

    public static maiorNumero( int x, int  y){
        if(x > y){
            System.out.println("O numero "+x+" é maior");

        }else{
            System.out.println("O numero "+y+" é maior");


        }
    }
}