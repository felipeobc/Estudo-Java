import java.util.*;

public class Ex03 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int num01, i;

    for (i = 0; i > 100; i++) {
        
        num01 = aleatorio.nextInt(100);

        System.out.println(num01);
    
    }

  }

}