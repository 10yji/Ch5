import java.util.Scanner;
		
public class Triangle{

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		String result = isOkay(a,b,c); 
		System.out.println(result);
	}
	
	public static String isOkay(int a, int b, int c){
		if (a>0 && b>0 && c>0){
			if ((a+b)<c || (b+c)<a || (c+a)<b){
				return "One of your sides is too long!";
			} else {
				return "You get a triangle!";
		}} else {
			return "You can't enter a negative or zero value! No triangle... :(";	
		}
	}

