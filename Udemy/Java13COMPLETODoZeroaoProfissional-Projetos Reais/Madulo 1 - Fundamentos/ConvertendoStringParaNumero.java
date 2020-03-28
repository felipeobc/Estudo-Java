import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * ConvertendoStringParaNumero
 */
public class ConvertendoStringParaNumero {

    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite seu primeiro Numero:");
        String valor2 = JOptionPane.showInputDialog("Digite seu segundo Numero:");
        
        
        System.out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;

        System.out.println("Soma: "+ soma);
        System.out.println("Media" + soma/2);

        //Desafio

        String Salario1, Salario2, Salario3;
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite os seus ultimos 3 salarios");
        Salario1 = ler.nextLine().replace(",", ".");
        Salario2 = ler.nextLine().replace(",", ".");
        Salario3 = ler.nextLine().replace(",", ".");
        ler.close();

        double Salario10, Salario11, Salario12, media;

        Salario10 = Double.parseDouble(Salario1);
        Salario11 = Double.parseDouble(Salario2);
        Salario12 = Double.parseDouble(Salario3);

        System.out.println("Media = "+ (Salario10 + Salario11 + Salario12)/2);

        

    }
}