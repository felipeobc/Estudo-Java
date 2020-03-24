/**
 * TipoString
 */
public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));
        String s = "Boa Tarde";
        s = s.toUpperCase();


        System.out.println(s.concat("!!!!"));
        System.out.println(s + "!!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.equals("Boa Tarde"));
        System.out.println(s.equalsIgnoreCase("Boa Tarde"));


        

    }
}