import java.util.*;

public class Ex03{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Digite o 1 numero: ");
        num1 = ler.nextInt();
        System.out.print("Digite o 2 numero: ");
        num2 = ler.nextInt();
        System.out.print("Digite o 3 numero: ");
        num3 = ler.nextInt();

        if(num1 > num2){
            if(num2 > num3){
                System.out.print(+num1+" "+num2+" "+num3);
            }else if(num1 > num3){
                System.out.print(+num1+" "+num3+" "+num2);
            }else{
                System.out.print(+num3+" "+num1+" "+num2);
            }
        }else if(num2 > num3){
            if(num1 > num3){
                System.out.print(+num2+" "+num1+" "+num3);
            }else{
                System.out.print(+num2+" "+num3+" "+num1);
            }
        }else{
            System.out.print(+num3+" "+num2+" "+num1);
        }
    }
}