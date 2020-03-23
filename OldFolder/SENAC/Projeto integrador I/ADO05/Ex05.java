import java.util.*;
public class Ex05{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Double idade;

        System.out.print("Digite a sua idade: ");
        idade = ler.nextDouble();

        if(idade >= 18){
            System.out.println("Voce pode Beber e Dirigir");
        }else{
            System.out.println("Voce nao pode Beber e Dirigir");
        }

        if(idade == 16 || idade < 18 && idade >=70){
            System.out.println("Voto Facultativo");
        }else{
            System.out.println("Voto Obrigatorio");
            
        }
    }
}