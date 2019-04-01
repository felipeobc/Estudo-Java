import java.util.Scanner;
public class Ex15{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int dia;

        System.out.print("Dica a semana tem 7 dias");
        System.out.print("Esolha o um numero: ");
        dia = ler.nextInt();

        
        
        if(dia <=0 && dia > 7){
            System.out.print("Opcao incorreta");
        }

        if(dia == 1){
            System.out.println("Domingo");
        }else if(dia == 2){
            System.out.println("Segunda");
        }else if(dia == 3){
            System.out.println("Terça");
        }else if(dia == 4){
            System.out.println("Quarta");
        }else if(dia == 5){
            System.out.println("Quinta");
        }else if(dia == 6){
            System.out.println("Sexta");
        }else if(dia == 7){
            System.out.println("Sabado");
        }
    }
}