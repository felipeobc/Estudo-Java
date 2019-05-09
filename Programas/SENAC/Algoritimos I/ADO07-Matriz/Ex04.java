import java.util.*;

public class Ex04{
    public static void main(String[] args) {
        int [][] matriz = new int[89][89];
        
        int i, j, somaDiagonal=0;
        
        
        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz[j].length; j++){
                    matriz[i][j] = Math.random() % 109 +10;       
            }
        }

        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz[j].length; j++){
                if(i == j){
                    somaDiagonal += matriz[i][j];
                }
            }
        }
        
        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz[j].length; j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
}