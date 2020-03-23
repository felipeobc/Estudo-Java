
public class Condicional2 {
	public static void main(String[] args) {
		
		System.out.println("Condicionais");
		
		int idade;
		idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if((idade >= 18) || ( acompanhado)) {
			
			System.out.println("Maior de idade");
		
		}else {
			
			System.out.println("Menor de Idade");
		}
	}

}
