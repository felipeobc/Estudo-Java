import java.util.Scanner;


public class Ex01 {  
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    double nota01, nota02, nota03, media;

    System.out.println("Digita o valor da nota 01: ");
    nota01 = leitor.nextDouble();

    System.out.println("Digita o valor da nota 01: ");
    nota02 = leitor.nextDouble();

    System.out.println("Digita o valor da nota 01: ");
    nota03 = leitor.nextDouble();

    media = (nota01+nota02+nota03) / 3;

    System.out.println("Media aritmética do aluno foi: " + media);

  }  
}