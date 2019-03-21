import java.util.Scanner;
public class Ex06{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int ano;

        ano = ler.nextInt();
        

        if(ano % 100 != 0 && ano % 4 == 0  || ano % 400 == 0){
            System.out.println("Esse ano é Bisexto!");
        }else{
            System.out.println("Esse ano não é Bisexto");
        }

    }
}