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

        if(x % 2 == 0){
            System.out.println("Esse numero é Par");
        }else{
            System.out.println("Esse numero é Impar");
       }
    }
}