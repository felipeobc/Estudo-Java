import java.util.*;

public class Ex13 { 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra, frase, palavraNova;
        int posicao;

        System.out.print("Escreva uma frase: ");
        frase = ler.next();

        System.out.print("Escreva uma palavra dessa frase: ");
        palavra = ler.next();

        System.out.print("Escreva uma nova palavra: ");
        palavraNova = ler.next();

        frase = frase.replace(palavra, palavraNova);
       
        System.out.println(frase);

       
        
    }
}