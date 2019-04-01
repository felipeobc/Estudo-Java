import java.util.*;
public class APIIAtividade01{
    
    public static void mostraNomes(String[] x){
        int i;

        for(i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
    }
    
    public static String adicionaNome(String[] y){
        Scanner ler = new Scanner(System.in);
        
        String a;
        int i;
        
        System.out.print("Informe um nome: ");
        a = ler.next();
        
        for(i = 0; i < y.length; i++){
            if(y[i] == null){
                y[i] = a;
                break;
            }else{
                System.out.println("Lista está Cheia");
            }
        }

    }
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        String[] nome;
        int opcao, i;
         nome = new String[50];
        
        mostraNomes(nome);
        do{
            System.out.println("1 - Adicionar um nome\n2 - Apresentar os Nomes\n3 - Pesquisar um Nome\n4 - Remover um nome\n0 - Sair");
            System.out.print("Escolha uma Opção: ");
            opcao = num.nextInt();


        }while(opcao <= -1 && opcao < 4 );

        


    }
}