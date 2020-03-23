import java.util.*;
public class Ex06{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Double nota1, nota2, nota3;

        System.out.print("Digite a nota 01: ");
        nota1 = ler.nextInt();
        System.out.print("Digite a nota 02: ");
        nota2 = ler.nextInt();
        System.out.print("Digite a nota 03: ");
        nota3= ler.nextInt();

        media = (nota1+nota2+nota3)/3;


        if(media <= 0 && media < 4){
            
            System.out.println("Nota E");
        
        }else if(media <=4 && media < 5){

            System.out.println("Nota D");
       
        }else if(media <=5 && media < 7){

            System.out.println("Nota C");
        }
        else if(media <=7 && media < 8){

            System.out.println("Nota B");
        
        }else{
            
            System.out.println("Nota A");
        }
            
    }
}