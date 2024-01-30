package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		//byte
		Byte b = 100; //Wrapper
		Short s = 1000; //Wrapper
		Integer i = Integer.parseInt("10000"); //Wrapper
		long l = 100000L; //Wrapper
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); // Boolean é um Wrapper
		boolean boo = Boolean.parseBoolean("true"); // boolean é um tipo primitivo
		System.out.println(bo.toString().toUpperCase());
		System.out.println(boo);
		
		Character c = '#'; // char
		
		System.out.println(c + "...");
	}
}
