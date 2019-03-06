
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author felipe.obcamargo
 */
public class Ex03 {
    public static void main(String[] arg){

        int codigoDaPeca, quantidadeDePeca, codigoDoPedido;
        double valorDaPeca;
        
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        System.out.print("Cododigo da Peça: ");
        codigoDaPeca =  leitor.nextInt();
        
        System.out.print("Valor da Peça R$: ");
        valorDaPeca =  leitor.nextDouble();
        
        System.out.print("Quantidade da Peça: ");
        quantidadeDePeca =  leitor.nextInt();
        
        System.out.println("\nQuantidade de Peças: " +quantidadeDePeca+ "\nValor Total da Compra R$: " +(quantidadeDePeca*valorDaPeca));
        System.out.println("Codigo da Peça: " +codigoDaPeca+ "\nNuemero do Pedido: " +gerador.nextInt(1000));
        
        
      }
}
