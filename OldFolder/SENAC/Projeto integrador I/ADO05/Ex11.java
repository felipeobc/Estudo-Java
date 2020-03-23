import java.util.*;

public class Ex12 { 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra;

        System.out.print("Escreva uma palavra: ");
        palavra = ler.next();

        palavra = palavra.substring(0,1).toUpperCase().concat(palavra.substring(1));
        System.out.println(palavra);
        
    }

}