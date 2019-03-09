/**
 * Implementar um algoritmo que leia dois números e imprima a soma do cubo (elevado a 3)
dos dois números. Utilize o comando Math.pow(numero, expoente) para calcular a
potência
 */


import java.util.Scanner;
 
public class Ex04{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double numero01, numero02, soma;

    System.out.println("Numero 1: ");
    numero01 = ler.nextDouble();

    System.out.print("Numero 2: ");
    numero02 = ler.nextDouble();

    soma = (Math.pow(numero01, 3)) + (Math.pow(numero02, 3));
    System.out.println(soma);

    

  }
}