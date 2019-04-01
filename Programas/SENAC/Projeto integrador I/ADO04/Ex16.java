import java.util.Scanner;
public class Ex16{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String dia;

        System.out.print("Dica Digite o dia da semana");
        System.out.print("Escreva o dia da seamna: ");
        dia = ler.next();

        if(dia == 'Domingo'){
            System.out.println("1");
        }else if(dia == 'Segunda'){
            System.out.println("2");
        }else if(dia == 'Terça'){
            System.out.println("3");
        }else if(dia == 'Quarta'){
            System.out.println("4");
        }else if(dia == 'Quinta'){
            System.out.println("5");
        }else if(dia == 'Sexta'){
            System.out.println("6");
        }else if(dia == 'Sabado'){
            System.out.println("7");
        }
    }
}