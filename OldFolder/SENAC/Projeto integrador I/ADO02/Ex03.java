/**mplemente um algoritmo que leia três números e imprima na tela o produto
(multiplicação) dos três números */

import java.util.*;

public class Ex03{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int numero01, numero02, numero03;

    System.out.print("Numero 1: ");
    numero01 = ler.nextInt();
    System.out.print("Numero 2: ");
    numero02 = ler.nextInt();
    System.out.print("Numero 3: ");
    numero03 = ler.nextInt();

    System.out.println("Produtos dos 3 numeros: "+ (numero01*numero02*numero03));
  }
}