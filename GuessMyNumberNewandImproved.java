import java.util.Scanner;
import java.util.Random;

public class GuessMyNumberNewandImproved {
	
	public static void main (String[] args) {
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		Scanner in = new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("(including both). Can you guess what it is?");
		printOut(in, number);
		printOut(in, number);
		printOut(in, number);
		
	}

	public static String isCorrect(int a, int b) {
		if (a != b) {
			if (a>b) {
			return ("Guess lower!");
		} else {
			return ("Guess higher!");
		}
		} else {
			return ("Spot on!");
		
	}
}
	
	public static String printOut(Scanner in, int number){
		int guess = in.nextInt();
		String result = isCorrect(guess, number);
		System.out.println(result);
		return result;
}
}
