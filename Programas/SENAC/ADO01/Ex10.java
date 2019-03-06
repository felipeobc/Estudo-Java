
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe.obcamargo
 */
public class Ex10 {
    public static void main(String[] arg){

        double numero01, numero02, numero03, numero04, soma;       

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numeor : ");
        numero01 =  leitor.nextInt();
        
        System.out.print("Digite outro numero: ");
        numero02 =  leitor.nextInt();
        
        System.out.print("Digite outro numero: ");
        numero03 =  leitor.nextInt();
        
        System.out.print("Digite outro numero: ");
        numero04 =  leitor.nextInt();
        
        numero01 = Math.pow(numero01,2);
        numero02 = Math.pow(numero02,2);
        numero03 = Math.pow(numero03,2);
        numero04 = Math.pow(numero04,2);
        
        soma = numero01 + numero02 + numero03 + numero04;
      
        System.out.println( " o quadrado para cada número, e imprima a soma: " + soma );
               
      }
}
