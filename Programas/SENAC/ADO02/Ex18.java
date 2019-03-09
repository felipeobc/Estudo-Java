/**
 * Elabore um programa que permita ao usuário informar determinada temperatura em
graus Celsius e converta e exiba seus respectivos valores em graus Kelvin e Fahrenheit
 */

import java.util.Scanner;

public class Ex18{
  public static void main(String[] arg){
    Scanner ler = new Scanner(System.in);

    double Celsius, Kelvin, Fahrenheit;

    System.out.print("Digite o a Temperatura em Celsio: ");
    Celsius = ler.nextDouble();

    Kelvin = Celsius + 272.32;

    System.out.print("Temperatura em Kelvin: " +(Celsius + 273.15) + "Temperatura em Fahrenheit" +( Celsius * 1.8000 + 32.00));

    
  }
}