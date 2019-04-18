import java.util.*;

public class Ex04{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        int i;
        String nome, nomeAux=" ";
        double altura, alturaAux;

        alturaAux=0;
        i=0;
        while(i < 4){
            System.out.print("Digite o nome do"+(i+1)+"º atlera: ");
            nome = ler.nextLine();
            System.out.print("Digite a altura do"+(i+1)+"º atlera: ");
            altura = num.nextDouble();

            if(altura > alturaAux){
                nomeAux = nome;
                alturaAux = altura;

            }
            i++;
        }
        System.out.println("O atleta "+nomeAux+" é o mais alto com: "+alturaAux);
    }
}