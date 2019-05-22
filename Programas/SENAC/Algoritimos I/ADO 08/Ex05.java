import java.util.*;

public class Ex01{
    public static void main(String[] args) {
        ler = new Scanner(System.in);
        int escolha, Temperatura;

        System.out.println("Voce gostaria de converter para Celsius(1) ou  para Fahrenheit(2)? ");
        System.out.print("Faça uma escolha: ");
        escolha = ler.nextInt();
        
        
        

        switch(escolha){
            case 1: System.out.println("Celsius");
                    System.out.print("Qual a Temperatura? ");
                    Temperatura = ler.nextInt();
                    Temperatura = converteFahrenheit(Temperatura);
                    System.out.print("A temperatura em Fahrenheit: "+Temperatura);
            
            case 2: System.out.println("Faherenheit");
                    System.out.print("Qual a Temperatura? ");
                    Temperatura = ler.nextInt();
                    Temperatura = converteCelsiud(Temperatura);
                    System.out.print("A temperatura em Celsius: "+ Temperatura);

        }
        
    }

    public static int converteCelsiud( int x){
        return ((x - 32) * 5/9); 

    }
    public static int converteFahrenheit( int x){
        return (x*2+32); 

    }
}