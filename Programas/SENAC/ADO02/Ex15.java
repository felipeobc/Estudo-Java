import java.util.Scanner;

public class Ex15{
  public static void main(String[] arg){
    Scanner ler = new Scanner(System.in);

    String nomeCelular;
    double precoFabrica, imposto, precoFinal;

    System.out.print("Modelo do Celular: ");
    nomeCelular = ler.next();

    System.out.print("Preço de Fabrica R$: ");
    precoFabrica = ler.nextDouble();

    imposto = precoFabrica * (0.28 + 0.20);
    precoFinal = imposto + precoFabrica;

    System.out.println(nomeCelular +" Valor final do produto R$:" + precoFinal);
    
    
  }
}