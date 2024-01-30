package fundamentos;

public class DesafioAritmeticos {
 public static void main(String[] args) {
	int a = 3 * 4 - 10;
	int b = (int) Math.pow(a, 3);
	System.out.println(b);
	
	int part1 = (int) Math.pow((6 * (3 + 2)), 2) / (3 * 2); 
	int part2 = (int) Math.pow(((1 - 5) * (2 - 7) / 2), 2) ; 
	int cal = (int) Math.pow((part1 - part2), 3) / (int) Math.pow(10, 3);
	
	System.out.println(cal);
	
	double numA =  Math.pow(6 * (3 + 2), 2);
	double denA = 3 * 2;
	
	double numB = (1 - 5) * (2 - 7);
	double denB = 2;
	
	double superiorA = numA / denA;
	double superiorB = Math.pow(numB / denB, 2);
	
	double superior = Math.pow(superiorA -  superiorB, 3);
	double inferior =  Math.pow(10, 3);
	
	double call = superior / inferior;
	System.out.println(call);
 	}
}
