/**
 * Elabore um programa que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa apenas em dias
 */

import java.util.Scanner;

public class Ex07{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int anos, meses, dias, resultado;

    System.out.print("Digite sua idade em anos: ");
    anos = ler.nextInt();

    System.out.print("Digite sua idade em meses: ");
    meses = ler.nextInt();
    
    System.out.print("Digite sua idade em dias: ");
    dias = ler.nextInt();

    resultado = (dias+(anos*365)+(meses*30));

    System.out.println(resultado);

  }
}