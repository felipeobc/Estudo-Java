import java.util.*;
import java.util.Random;

import sun.java2d.loops.MaskBlit;

public class Ex01{
    public static void main(String[] args) {
        String [][] matriz = new String[9][9];
        
        int i, j;
        
        i = Math.random()*9;
        j = Math.random()*9;

        matriz[i][j] = "8";

        
        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz[j].length; j++){
                if(matriz[i][j] != "8" ){
                    matriz[i][j] = "B";
                }
            }
        }

        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz.length; j++){
                System.out.println(matre);
            }
        }
    }
}