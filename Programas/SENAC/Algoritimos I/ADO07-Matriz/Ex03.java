import java.util.*;

public class Ex01{
    public static void main(String[] args) {
        int [][] matriz = new int[89][89];
        
        int i, j, somaLinha=0;
        
        
        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz[j].length; j++){
                    matriz[i][j] = Math.random() % 109 +10;
                    somaLinha += matriz[i][j];        
            }
            System.out.println("Soma: " + somaLinha);
        }
        
        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz[j].length; j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
}