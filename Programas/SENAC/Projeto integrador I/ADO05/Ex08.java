import java.util.*;

public class Ex08{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String texto;
        int tamanho;

        System.out.print("Ditite um texto: ");
        texto = ler.nextLine();

        tamanho = texto.length();

        System.out.println("Esse texto tem: " +tamanho+ "Caracteres");



    }
}