import java.util.Scanner;

public class Problem1{

	public static void main(String[] args) {
		Scanner abc =new Scanner(System.in);
		System.out.println("Enter an a value : ");
		double a = abc.nextDouble();
		System.out.println("Enter an b value : ");
		double b = abc.nextDouble();
		System.out.println("Type an an operator :add/sub/mul/div");
		String c = abc.next();
		switch(c) {
		case "add":
			System.out.println(a+b);
			break;
		case "sub":
			System.out.println(a-b);
			break;
		case "mul":
			System.out.println(a*b);
			break;
		case "div":
			System.out.println(a/b);
			break;
		default:
			System.out.println("incorect operator");
			
		}
	}

}