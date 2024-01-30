package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		
		System.out.println(c);
		
		double d;
		d = 123.45;
		System.out.println(d);

		//var d;  erro , o tipo precisa ser declarado na criação
		//d = 123.45;
		//System.out.println(d);

		//var e = 1;
		//e = 2.2; //erro, valor inteiro não recebe casas decimais
		//System.out.println(e);
	}
}
