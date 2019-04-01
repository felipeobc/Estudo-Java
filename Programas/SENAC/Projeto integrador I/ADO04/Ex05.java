import java.util.Scanner;
public class Ex05{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero01;
        System.out.println("Historia!");
        System.out.println("Em que ano o Brasil foi decobertos pelos os portugueses?");
        System.out.println("1 - 800\n2 - 1320\n3 - 1500\n4 - 1600");
        System.out.print("Qual é a reposta certa?: ");


        numero01 = ler.nextInt();

        if(numero01 <= 0 || numero01 > 4 ){
            System.out.println("Opção incorreta");
        }else if(numero01 == 3){
            System.out.println("Você acertou :)");
                                  
        }else{
            System.out.println("Você errou!");
        }

    }
}