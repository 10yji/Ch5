import java.util.Scanner;

public class Fermat{
	
	public static void main (String[] args) {
	double a = 3.0;
	double b = 4.0;
	double c = 5.0;
	double n = 3.0;
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
