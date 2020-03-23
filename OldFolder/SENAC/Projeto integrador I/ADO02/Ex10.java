/**
 * . Faça um algoritmo que leia o tempo de duração de um evento em uma fábrica expressa
em segundos e mostre-o expresso em horas, minutos e segundos
 escreva(“Digite a duração do evento em segundos:”)
    leia(segundos)
    horas<-(segundos div 3600)
    minutos<-((segundos mod 3600) div 60)
    seg<-((segundos mod 3600) mod 60)
    escreva(“A duração do evento foi de”, horas,” horas”, minutos ,” minutos e”, seg ,” segundos”)
  fimalgoritmo
 */

 import java.util.Scanner;

 public class Ex10{
   public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    int horas, minutos, segundos;

    System.out.print("Digite os segundo para o termino do evento: ");
    segundos = ler.nextInt();

    horas = segundos % 3600;
    minutos = (segundos % 3600) / 60;
    segundos = (segundos % 3600) % 60;

    System.out.println("Tempo  para  o termino: "+horas+":"+minutos+":"+segundos);

   }
 }

 