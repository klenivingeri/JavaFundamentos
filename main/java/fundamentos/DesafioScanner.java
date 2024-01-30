package fundamentos;

import java.util.Scanner;
import java.util.Locale;
public class DesafioScanner {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("\n Digite Salario1: ");
		Double salario1 = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.printf("\n Digite Salario1: ");
		Double salario2 = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.printf("\n Digite Salario1: ");
		Double salario3 = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		input.close();
		

		Double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("média: " + media);

	}
}
