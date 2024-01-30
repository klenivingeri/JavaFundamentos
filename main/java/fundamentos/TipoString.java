package fundamentos;

import java.util.Scanner;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa")); // verifica se a string começa com esse valor
		System.out.println(s.endsWith("!!!"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = "33";
		var salario =  12345.122;
		
		System.out.printf("Nome senhor %s %s tem %s anos e ganha R$: %.2f de salario", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nNome senhor %s %s tem %s anos e ganha R$: %.2f de salario.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".concat("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6,8));
		
		System.out.printf("Megasegan: %s %d %d", idade, 2 ,3);
		System.out.printf("\nNome: %s%n", "Erick");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("\n Digite seu Nome: ");
		String _nome = entrada.nextLine();
		
		System.out.printf("Digite seu Sobrenome: ");
		String _sobrenome = entrada.nextLine();
		
		System.out.printf("Digite seu Idade: ");
		String _idade = entrada.nextLine();
		
		entrada.close();
		System.out.printf("Nome: %s %s tem %s anos", _nome , _sobrenome, _idade);
	} 
}
