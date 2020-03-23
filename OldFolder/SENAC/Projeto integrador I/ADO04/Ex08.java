import java.util.Scanner;
import java.lang.*;

 public class Ex08{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero1, numero2, resto ;
        


        System.out.print("Digie um Numero: ");
        numero1 = ler.nextInt();
        System.out.print("Digie um Numero: ");
        numero2 = ler.nextInt();

        if(numero1 == numero2){
            System.out.println("São iguais");
        }else{
            System.out.println("Não são iguais");
        }
        
        if(numero1 != numero2){
            System.out.println("São diferentes");
        }else{
            System.out.println("Não são diferentes");
        }
        
        if(numero1 > numero2){
            System.out.println("O primeiro é maior que o segundo");
        }else{
            System.out.println("O primeiro não é maior que o segundo");
        }

        if(numero1 > numero2){
            System.out.println("O segundo é maior que o primeiro");
        }else{
            System.out.println("O segundo não é maior que o primeiro");
        }
       
        if(numero1 < 0){
            System.out.println("O primeiro é negativo");
        }else{
            System.out.println("O primeiro não é negativo");
        }

        if(numero2 < 0){
            System.out.println("O Segundo é negativo");
        }else{
            System.out.println("O Segundo não é negativo");
        }
        
        resto = numero1 % numero2;

        if(resto > 0){
            System.out.println("Há resto de divisão ao dividir o primeiro pelo segundo");
        }else{
            System.out.println("Não há resto de divisão ao dividir o primeiro pelo segundo");
        }

        
        
        
    }
}