import java.util.Scanner;
		
public class Quadratic{

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("YOU: Waiter! Waiter! Find the roots to my quadratic please!");
		System.out.println("WAITER: Certainly. What is your first number, a?");
		double no1 = in.nextDouble();
		System.out.println("WAITER: Second, b?");
		double no2 = in.nextDouble();
		System.out.println("WAITER: Third, c?");
		double no3 = in.nextDouble();
		String hi = positiveResult(no1,no2,no3);
		String hello = negativeResult(no1,no2,no3);
		System.out.println(hi);
		System.out.println(hello);
	
	}
	
	public static String positiveResult(double a, double b, double c){
			double bSquare = Math.pow(b, 2.0);
			double discriminant = Math.pow((bSquare-(4.0*a*c)), (1.0/2.0));
		if (discriminant >= 0.0 && 2.0*a != 0.0){
			double x = ((-b + discriminant)/(2*a));
			return "" + x;
	} else {
		if (a == 0){
		return ("WAITER: This one does not work. Your a is 0, and our restaurant is unable to divide by 0.");
	} else {
		return ("WAITER: This one does not work. Your discriminant is less than 0. Our restaurant is unable to square root a negative number.");
		}
	}
}
	
	public static String negativeResult(double a, double b, double c){
		double bSquare = Math.pow(b, 2.0);
		double discriminant = Math.pow((bSquare-(4.0*a*c)), (1.0/2.0));
		if (discriminant >= 0 && 2*a != 0){
			double x = ((-b - discriminant)/(2*a));
			return "" + x;
	} else {
		if (a == 0){
		return ("WAITER: This one does not work. Your a is 0, and our restaurant is unable to divide by 0.");
	} else {
		return ("WAITER: This one does not work. Your discriminant is less than 0. Our restaurant is unable to square root a negative number.");
	}
		}
	}
}
