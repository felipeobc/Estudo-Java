/**
 * SWITCH
 */
public class SWITCH {

    public static void main(String[] args) {
        String faixa = "preta";

        switch(faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei Tekki Shodan...");
            default:
                System.out.println("não sei de nada");
        }

        int idade = 2;

    switch (idade) {
        case 2:
            System.out.println("sabe programar?");
    
        default:
            System.out.println("Seu bosta");
            
        }
    }
}
