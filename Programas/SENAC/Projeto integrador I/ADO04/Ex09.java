import java.util.Scanner;
public class Ex09{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero01, numero02, opcao;

        System.out.print("Escreva um numero: ");
        numero01 = ler.nextInt();

        System.out.print("Escreva outro numero: ");
        numero02 = ler.nextInt();

        System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        System.out.print("Escolha uma opção: ");
        opcao = ler.nextInt();

        if(opcao == 1){
            System.out.println("Adição: " + (numero01 + numero02));
        }

        if(opcao == 2){
            System.out.println("Subtração: " + (numero01 - numero02));
        }

        if(opcao == 3){
            System.out.println("Multiplicação: " + (numero01 * numero02));
        }

        if(opcao == 4){
            System.out.println("Divisão: " + (numero01 / numero02));
        }
    }
}