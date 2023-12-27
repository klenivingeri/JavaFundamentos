package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (F - 32) * 5/9 = C
		double fahrenheit = 86;
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9;
		double celsius =  (fahrenheit - AJUSTE) * FATOR;

		System.out.println("resultado: " + celsius + "°C.");
		
		fahrenheit = 43;
		celsius =  (fahrenheit - AJUSTE) * FATOR;

		System.out.println("resultado: " + celsius + "°C.");
	}
	
	/**
	 * divisão de numeros inteiros sempre da numero inteiros
	 * divisão de numeros decimais sempre da numero decimais
	 * divisão que contem inteiro e decimal sempre da decimal
	 * 
	 * Dicas:
	 *	Alt + seta: move a linha 
	 * 	Ctrl + Alt + seta: duplica a linha
	 */
}
