import java.util.*;

public class Ex02{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valorProduto;
        int formaPagameto;

        System.out.print("Qual o valor do produto R$: ");
        valorProduto = ler.nextDouble();

        System.out.println("Forma de Pagamento");
        System.out.print("1 - Dinheiro ou Cheque\n2 - Cartão a Vista\n3 - 2x no Cartão sem Juros \n 4 - 2x no Cartão com Juros");
        Sytem.out.print("Escolha uma Opção:");

        System.out.print("Qual o valor do produto R$: ");
        formaPagameto = ler.nextInt();

        switch(formaPagameto){
            case 1: System.out.println("Dinheiro / Cheque");
                    System.out.println("Valor a pagar R$: "+(((valorProduto*10)/100) - valorProduto));
                    break;
            
            case 2: System.out.println("Cartão de credito");
                    System.out.println("Valor a pagar R$: "+(((valorProduto*15)/100) + valorProduto));
                    break;
            
            case 3: System.out.println("2x Sem juros");
                    System.out.println("Valor a pagar R$: "+(valorProduto / 2));
                    break;
                
            case 4: System.out.println("2x Com juros");
                    System.out.println("Valor a pagar R$: "+((((valorProduto*15)/100) + valorProduto) / 2));
                    break;
        }

        

        
    }
}