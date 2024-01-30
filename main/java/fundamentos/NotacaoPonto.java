package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		 String s = "bom dia X";
		 s = s.toUpperCase();
		 System.out.println(s);
		 
		 s = s.replace("X", "Senhora");
		 System.out.println(s);
		 
		 s = s.concat("!!!");
		 System.out.println(s);
		 
		 var b = "Bom dia X"
				 .replace("X", "Senhor")
				 .toUpperCase()
				 .concat("!!!");
		 System.out.println(b);
		 
		 // Tipos primitivos não tem o operador "."
		 int a = 3;
		 System.out.println(a);
		 
		 
	}
}
