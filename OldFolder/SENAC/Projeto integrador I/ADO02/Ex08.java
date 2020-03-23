/**
 * . Faça um algoritmo que leia a idade de uma pessoa expressa em dias e mostre-a expressa
em anos, meses e dias

 var
   anos, meses, dias: inteiro
  inicio
  escreva("Digite os dias :")
  leia(dias)
  anos <- (dias div 365)
  meses <- ((dias mod 365)div 30)
  dias <- ((dias mod 365)mod 30)
  escreva ("  Idade em anos=", anos)
  escreva ("  Idade em meses=", meses)
  escreva ("  Idade em dias=", dias)
 */

import java.util.Scanner;

public class Ex08{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int anos, meses, dias;

    System.out.print("Digite sua idade em dias: ");
    dias = ler.nextInt();

    anos = (dias / 365);
    meses = ((dias % 365) / 30);
    dias = ((dias % 365) % 30);


    System.out.println(anos);
    System.out.println(meses);
    System.out.println(dias);

  }
}