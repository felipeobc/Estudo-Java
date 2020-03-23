/*Leia os seguintes dados de um cliente durante a execução do programa:
• Nome
• Estado Civil
• Endereço
• Telefone
Quando ler o último dado, exiba um resumo da ficha do cliente no console */

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Scanner teste = new Scanner(System.in);
    String nome, estadoCivil, endereco;
    int telefone;

    System.out.print("Digite o seu nome: ");
    nome = ler.next();
    
    System.out.print("Digite o seu estado civil: ");
    estadoCivil = ler.next();
    
    System.out.print("Digite o seu endereço: ");
    endereco = ler.next();
    
    System.out.print("Digite o seu Telefone: ");
    telefone = teste.nextInt();

    System.out.println("Nome: "+nome);
    System.out.println("Estado Civil: "+estadoCivil);
    System.out.println("Endereço: "+endereco);
    System.out.println("Telefone: "+telefone);



 
  }
}