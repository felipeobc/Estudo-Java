import java.util.Scanner;
public class Ex11{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.print("Informe a idade do nadador: ");
        idade = ler.nextInt();


        if(idade <= 7  ){
            System.out.println("Infantil A");
        }else if(idade > 7 && idade <= 10){
            System.out.println("Infatil B");
        }else if(idade > 11 && idade <= 13){
            System.out.println("Juvenil A");
        }else if(idade > 14 && idade <= 17){
            System.out.println("Juvenil B");
        }else{
            System.out.println("Maiores de 18");
        }
    }
}