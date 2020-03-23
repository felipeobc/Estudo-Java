import java.util.Scanner;
public class Ex04{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero01;
        System.out.println("Menu Principal");
        System.out.println("1 - fim\n2 - Cadastro\n3 - Consultar");
        System.out.print("Escolha uma opção: ");


        numero01 = ler.nextInt();

        if(numero01 <= 0 || numero01 > 3 ){
            System.out.println("Opção incorreta");
        }else {
            switch(numero01){
                case 1: System.out.println("1 - fim");
                        break;
                case 2: System.out.println("2 - Cadastro");
                        break;
                case 3: System.out.println("3 - Consulta");
                        break;
            }
                       
        }

    }
}