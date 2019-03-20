
/**
 * 1. Elabore um programa Java que leia uma senha e a confirmação da mesma. Ao final, o programa deverá exibir uma mensagens caso as senhas sejam diferentes.
 
 * */
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int senha, digiteSenha;

			senha = 1234;
			digiteSenha = ler.nextInt();

			if(senha == digiteSenha){
				System.out.println("A senha esta correta!");
			}else{
				System.out.println("A senha incorreta!");
			}
    }
    
}