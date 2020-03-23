/**
 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas
efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de
comissão sobre suas vendas efetuadas, calcule e imprima o total a receber no final do
mês
 */

 import java.util.*;

 public class Ex06{
   public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);

     String nome;
     double salario, totalVendas, pagamentoFinal;
    
     System.out.print("Nome do vendedor: ");
     nome = ler.nextLine();

     System.out.print("Salario do vendedor: ");
     salario= ler.nextDouble();

     System.out.print("Valor total de vendas  efetuadas pelo o vendedor: ");
     totalVendas = ler.nextDouble();

     pagamentoFinal = (15*totalVendas)/100 + salario;

     System.out.println("Valor final a pagar com a ajute de comissão para o vendedor: "+ pagamentoFinal);





     
     

   }
 }