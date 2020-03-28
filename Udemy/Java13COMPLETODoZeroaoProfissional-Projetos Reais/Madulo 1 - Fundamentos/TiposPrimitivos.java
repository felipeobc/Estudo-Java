/**
 * TiposPrimitivos
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        //Informações de um funcionanrio
        //Tipos Numericos inteiro
        byte anosDeEmpresa = 23;
        short nuemroDeVoo = 542;
        int id = 56789;
        long pontosAcumalados = 3234845223L;

        // Tipos numericos

        float salario = 11445.44F;
        double vedasAcumuladas = 2991797103.01;
        //Tipos boolean 
        boolean estaDeFerias = false;
        //tipo  caractere
        char status = 'a'; //ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);
        //Numeros de viagens
        System.out.println(nuemroDeVoo /2);
        //Pontos por real
        System.out.println(pontosAcumalados / vedasAcumuladas);
        //etc...



    }
}