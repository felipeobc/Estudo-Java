import java.util.*;

public class Ex05{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        int i;
        String nome, sim, nomeAux=" ";
        double altura, alturaAux, media=0;

        alturaAux=0;
        i=0;
        while(i < 4){
            System.out.print("Digite o nome do"+(i+1)+"º atlera: ");
            nome = ler.nextLine();
            System.out.print("Digite a altura do"+(i+1)+"º atlera: ");
            altura = num.nextDouble();

            media += altura;
            System.out.print("Voce quer adicionar um novo atleta? (s/n)");
            sim = ler.nextLine();
            
            if(sim.equals('n')){
                i = 5;
            
            }else if(altura > alturaAux){
                nomeAux = nome;
                alturaAux = altura;
            }
            i++;
        }
        System.out.println("Media das altura: "+(media/5));
        System.out.println("O atleta "+nomeAux+" é o mais alto com: "+alturaAux);
        
    }
}