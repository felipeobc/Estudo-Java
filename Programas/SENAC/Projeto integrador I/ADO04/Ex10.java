import java.util.Scanner;
public class Ex10{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valorProduto;

        System.out.print("Qual é o Valor do Produto R$: ");
        valorProduto = ler.nextDouble();


        if(valorProduto >  20.00){
            System.out.println("O valor final do prouto para venda R$: " + ((valorProduto*45)/100));
        }else{
            System.out.println("O valor final do prouto para venda R$: " + ((valorProduto*30)/100));
        }
    }
}