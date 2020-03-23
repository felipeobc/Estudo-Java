import java.util.*;
public class Ex04{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Double num01, num02, x;

        System.out.print("Digite o primeiro numero: ");
        num01 = ler.nextDouble();

        System.out.print("Digite o segundo numero: ");
        num02 = ler.nextDouble();

        if(num01 > 0 && num02 > 0){
            x = num01 + num02;
            System.out.println("Numeros positivos: "+x);

        }else{
            x = num01 - num02;
            System.out.println("Numeros negativos: "+x);
        }
        
        if(x <= 99 || x >= -99){
            System.out.println("Não é Centena: "+x);

        }else{
            System.out.println("“É centena ou maior/menor"+x);
        }
    }
}