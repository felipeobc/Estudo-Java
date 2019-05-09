import java.util.*;

public class Ex01{
    public static void main(String[] args) {
        int [][] matriz = new int[2][2];
        
        int i, j;
        
        matriz[1][2] = 8;

        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz[j].length; j++){
                if(matriz[i][j] != 8 ){
                    matriz[i][j] = 0;
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