
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] arg){

        double reais, dolar;       

        Scanner leitor = new Scanner(System.in);

        System.out.print("reais R$: ");
        reais =  leitor.nextDouble();
        
        System.out.print("Dolar U$: ");
        dolar =  leitor.nextDouble();
        
        System.out.println( "Conversão do Dolar para reias R$: " + dolar*reais );
               
      }
}
