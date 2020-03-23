import java.util.*;

public class Ex12 { 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra;

        System.out.print("Escreva uma palavra: ");
        palavra = ler.next();

        System.out.println(palavra.toUpperCase());
        System.out.println(palavra.toLowerCase());
    }

}