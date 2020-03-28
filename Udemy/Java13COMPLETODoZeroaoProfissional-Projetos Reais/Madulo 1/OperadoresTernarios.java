/**
 * OperadoresTernarios
 */
public class OperadoresTernarios {

    public static void main(String[] args) {
    double media = 7.6;
    String resultadoRecuperacao = media >= 5.0 ? "em recuperação" : "Reprovado";
    String resultado = media >= 7.0 ? "Reprovado" : resultadoRecuperacao;

    System.out.println("O aluno está: " + resultado);

    }
}