/**
Elabore um programa capaz de ler a base e a altura de um triângulo para, em seguida,
escrever a sua área
 */

import java.util.Scanner;

public class Ex13{
  public static void main(String[] arg){
    Scanner ler = new Scanner(System.in);

    Double base, altura;

    
    System.out.print("Digite a base do triangulo: ");
    base = ler.nextDouble();

    System.out.print("Digite a altura do triangulo:");
    altura = ler.nextDouble();

    System.out.println("Area do triangulo: " + (base*altura)/2);
   
  }
}