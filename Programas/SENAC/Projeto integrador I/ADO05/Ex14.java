import java.util.*;

public class Ex14 { 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra, frase;
        int posicao;

        System.out.print("Escreva uma palavra: ");
        palavra = ler.next();

        System.out.print("Escreva uma frase: ");
        frase = ler.next();

        posicao = frase.indexOf(frase);
        

        if(posicao >=0){
            System.out.println("A palavra: " +palavra+" Está no texto");
        }else{
            System.out.println("A palavra não está no testo!");
        }
        
    }
}