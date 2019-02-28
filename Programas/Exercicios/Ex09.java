/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe.obcamargo
 */
 import java.util.Scanner;
 
public class Ex09 {
      public static void main(String[] arg){
        int numero01 , numero02 , soma;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o numero01: ");
        numero01 =  leitor.nextInt();
        
        System.out.print("Digite o numero02: ");
        numero02 =  leitor.nextInt();
        
        soma = numero01 * numero02;
        
        System.out.println("O produto desse valores: " + soma);
        
        
    }
    
}
