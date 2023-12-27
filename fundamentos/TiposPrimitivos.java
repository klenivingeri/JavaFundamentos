package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informaçãoes de funcionario

		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 12345;
		int id = 54321;
		long pontosAcumulados = 1_123_456_789L;

		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipos boolean
		boolean estaDeFerias = false; // true

		// Tipos caractere
		char status = 'A'; // Ativo

		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);

		// Números de viagens

		System.out.println(numeroDeVoos / 2);

		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);

		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias: " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
