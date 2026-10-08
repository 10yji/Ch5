import java.util.Scanner;

public class Fermat{
	
	public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Welcome back to our Saturday night game show, testing Fermat's Last Theorem! Input 4 integers a, b, c, and n such that a and b raised to the power of n cannot sum to c to the power of n, when n>2.");
	double a = in.nextDouble();
	double b = in.nextDouble();
	double c = in.nextDouble();
	double n = in.nextDouble();
	double expa = Math.pow(a, n);
	double expb = Math.pow(b, n);
	double expc = Math.pow(c, n);
	String result = fermatChecker(expa, expb, expc, n);
	System.out.println(result);
	
	
	}
	
	public static String fermatChecker(double x, double y, double z, double n){
		if (x+y==z && n>2){
			String result1 = ("Holy smokes, Fermat was wrong!");
			return result1;
		} else {
			String result2 = ("No, that doesn't work.");
			return result2;
		}
	}
}
