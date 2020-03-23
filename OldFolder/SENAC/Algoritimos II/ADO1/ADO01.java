import static java.lang.System.out;

import java.util.*;

public class teste {

    public static void main(String arg[]) {
        int n, resposta, x;
        n = 10000;
        
        int v[] = new int[n];
        System.out.println("v[ ");
        
        // Scanner x = new Scanner(System.in);
        Random r = new Random();
      
            
        for (int i = 0; i < 10000; i++) {
            
            v[i] = r.nextInt(10000);
        }
        x = r.nextInt(10000);
        
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ,");
        }
        out.println(" ]");

        resposta = linear_search(x, v, n);

        if (resposta != -1) {
            System.out.println("O valor foi  encontrado: " + resposta);
        } else {
            System.out.println("O valor não encontrado");

        }

    }

    
    public static int linear_search(int a, int b[], int c){
        int i;
        for (i = 0; i < c; i++) {
            if (b[i] == a) {
                return i;
            }
        }
        return -1;
    }
}

/**
 * Matheus Rocha Matumoto, Vitor Roverso, Lohan Martins, Maria Luiza Sayuri
 */