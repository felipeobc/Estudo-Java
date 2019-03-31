import java.util.*;

public class Ex09{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String texto, texto2;
        int tamanho;

        System.out.print("Ditite um texto: ");
        texto = ler.nextLine();
        
        tamanho = texto.length();

        texto2 = texto.substring(tamanho - 1); 

        System.out.println("A primeira letra do texto é: "+texto2);
        
    }
}