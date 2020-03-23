import java.util.*;

public class Ex15 { 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        String palavra;

        System.out.print("Escreva uma frase ou palavra: ");
        palavra = ler.next();

        StringBuffer ler2 = new StringBuffer(palavra);

        System.out.println("Sua palavara invertida: "+ ler2.reverse());
    }
}