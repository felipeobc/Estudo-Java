import java.util.*;

import com.sun.org.apache.xpath.internal.operations.String;

public class Ex05{
    public static void main(String[] args) {
        String [][] matriz = new String[9][9];
        Scanner ler = new Scanner(System.in);
        
        int i, j, escolha, sair=0;
        
        matriz[4][4] = "O";

       do{
            for(i = 0; i < matriz.length; i++){
                for(j = 0; j < matriz[j].length; j++){
                    System.out.println(matriz[i][j]);
                }
            }

           System.out.println("Escolha para andar: (1) - cima (2) - baixo (3) - esquerda (4) - direita (5) SAIR");
            escolha = ler.nextInt();

            

            if(escolha == 1){

            }
       }while(sair == 0);
        
    }
}