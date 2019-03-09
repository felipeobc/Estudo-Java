/**
 * Um motorista deseja colocar no seu tanque X reais de gasolina. Implemente um algoritmo
para ler o preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele
conseguiu colocar no tanque
 */

 import java.util.Scanner;

 public class Ex12{
   public static void main(String[] arg){
     Scanner ler = new Scanner(System.in);

     Double precoLitro, litroGasolina, litroTanque, pagamentoMotorista;
     
     System.out.print("Valor da gasolina/litro R$: ");
     precoLitro = ler.nextDouble();

     System.out.print("Valro para colocar no tangue:");
     pagamentoMotorista = ler.nextDouble();

     litroTanque = pagamentoMotorista / precoLitro;

     System.out.println("Quantidade de Litro no tanque: " + litroTanque);

     
     
   }
 }