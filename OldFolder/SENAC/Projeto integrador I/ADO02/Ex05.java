/**
 * Faça um programa que leia o valor de lado de um quadrado, calcule e exiba a área e o
perímetro deste quadrado. O programa deve imprimir ambas as respostas em um único
println
 */

 import java.util.Scanner;

 public class Ex05{
   public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);

     double lado, perimetro;

     System.out.print("Digito o  tamanho do lado desse quadrado: ");
     lado = ler.nextDouble();

    System.out.println("O valor da area do quandrado: "+Math.pow(lado, 2)+" e seu perimetro: "+(lado+lado+lado+lado));
    
   }
 }