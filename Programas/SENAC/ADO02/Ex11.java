/*
 Assumindo que uma imobiliária venda apenas terrenos retangulares, implemente um
algoritmo para ler as dimensões de um terreno (base e altura) e o preço do metro
quadrado, exibindo a área do terreno e o valor final em seguida (assuma que todas as
medidas são em metros). O programa deve imprimir ambas as respostas em um único
println
*/


import java.util.Scanner;

public class Ex11{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int base, altura, area;
    double alorMetro, valorFinalImovel, valorMetro;

    System.out.print("Digite o valor da base do metro: ");
    base = ler.nextInt();

    System.out.print("Digite o valor da altura do metro: ");
    altura = ler.nextInt();
    
    System.out.print("Valor do metro quandrado R$: ");
    valorMetro = ler.nextDouble();

    System.out.print("Tamanho do imovel m: ");
    area = ler.nextInt();


   valorFinalImovel = ((base * altura) * area) * valorMetro;

   System.out.println("Valor final do imovel R$: "+ valorFinalImovel);
   

  }
}