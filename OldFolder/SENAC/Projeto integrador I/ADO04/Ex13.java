import java.util.Scanner;
public class Ex13{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota1, nota2, nota3, media;

        System.out.print("Informe 1ª nota: ");
        nota1 = ler.nextInt();

        System.out.print("Informe 2ª nota: ");
        nota2 = ler.nextInt();

        System.out.print("Informe 3ª nota: ");
        nota3 = ler.nextInt();

        media = (nota1+nota2+nota3)/3;

        if(media <= 4){
            System.out.println("Nota E");
        }else if(media > 4 && media<= 5){
            System.out.println("Nota D");
        }else if(media > 5 && media <= 7){
            System.out.println("Nota C");
        }else if(media > 7 && media <= 8){
            System.out.println("Nota B");
        }else{
            System.out.println("Nota A");
        }
    }
}