package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1.12345678999; //1.12345678999 implícita
		System.out.println(a);
		
		float b = (float) 1.12345678999; //1.1234568 explícita (CAST) perda de dados
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // 84 explícita (CAST) perda de dados
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f); // 1
	}
}
