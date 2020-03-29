import java.util.Scanner;

/**
 * IF
 */
public class IF {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe a o valor da Media");
        double nota = ler.nextDouble();

        if(nota >= 7.0){
            System.out.println("O Aluno apassou");
        }else{
            System.out.println("O Aluno reprovou");
        }

        ler.close();
    }
}