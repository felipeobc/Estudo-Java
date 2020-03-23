/**
 * 14. Escreva um programa que solicita ao usuário a digitação de dois inteiros e imprime o
quociente e o resto da divisão euclidiana desses inteiros (utilize o operador % para calcular
o resto da divisão). O programa deve imprimir ambas as respostas em um único println
 */

import java.util.Scanner;

public class Ex14 {
  public static void main(String[] arg){
    Scanner ler = new Scanner(System.in);

    int numero01, numero02;

    
    System.out.print("Numero 1: ");
    numero01 = ler.nextInt();

    System.out.print("Numero 2:");
    numero02 = ler.nextInt();

    System.out.println("O quociente entre os numeros:" + (numero01 / numero02) + "O resto entre esse dois numeros"+ numero01 % numero02);
    
   
  }
}