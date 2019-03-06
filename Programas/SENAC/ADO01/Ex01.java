/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

     

    import java.util.Scanner;

public class Ex01 {
        
    public static void main(String[] arg){

        double salario , horasTrabalhadas;       

        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantidade de horas trabalhadas: ");
        horasTrabalhadas =  leitor.nextDouble();
        
        System.out.print("Salario por horas R$: ");
        salario =  leitor.nextDouble();
        
        System.out.println("Salarioa pagar R$: " + (salario*horasTrabalhadas));
      }
}
