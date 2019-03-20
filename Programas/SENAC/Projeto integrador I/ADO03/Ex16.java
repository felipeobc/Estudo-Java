import java.util.Scanner;
import java.lang.*;

 public class Ex16{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int senha1, senha2;
        boolean certo;


        System.out.print("Digie uma senha com apenas Numero: ");
        senha1 = ler.nextInt();
        System.out.print("Repita a senha: ");
        senha2 = ler.nextInt();
        certo = senha1 == senha2;
        
        System.out.println("Sua Senha esta: "+ certo);
        
        
    }
}