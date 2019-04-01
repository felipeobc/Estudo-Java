import java.util.Scanner;
public class Ex12{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int ano2, ano;

        System.out.print("Informe o ano atual: ");
        ano2 = ler.nextInt();

        System.out.print("Informe o ano do seu nascimento: ");
        ano = ler.nextInt();

        if(ano >= 0 && ano2 >=0){
            System.out.print("Sua idade é: "+ (ano2 - ano));
        }else{
            System.out.print("Ano incorreto");
        }
    }
}