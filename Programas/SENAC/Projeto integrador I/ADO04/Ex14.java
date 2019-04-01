import java.util.Scanner;
public class Ex14{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int x, y, z;

        System.out.print("Informe 1ª lado: ");
        x = ler.nextInt();

        System.out.print("Informe 2ª lado: ");
        y = ler.nextInt();

        System.out.print("Informe 3ª lado: ");
        z = ler.nextInt();

        if( z + y == z && x + z == y && y + z == x ){
            System.out.println("Três lados iguais equilátero");
        }else if(x + y ==z && x + z ==y && y + z != x){
            System.out.println("Dois lados iguais isósceles");
        }else if(x + y != z && x + z != y && y + z != x){
            System.out.println("Três lados diferentes escaleno");
        }
    }
}