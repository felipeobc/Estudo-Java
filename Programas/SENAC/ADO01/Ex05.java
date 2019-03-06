
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
public class Ex05 {
    public static void main(String[] arg){

        int numero;       

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        numero =  leitor.nextInt();
        
        System.out.println("O quadrado do numero digitado:  " +Math.pow(numero,2) );
        
        
      }
}
