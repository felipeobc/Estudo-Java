/**
 * NotacaoPonto
 */
public class NotacaoPonto {

    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!!");

        System.out.println(s);
        
        String x = "Leo".toUpperCase();
        System.err.println(x);

        String y = "Bom Dia X".replace("X", "Gui").toUpperCase().concat("!!!");
        System.out.println(y);

        


    }
}