import java.util.Random;
import java.util.Scanner;

public class Number {
	private static Scanner input;

	public static void main(String[] args) {
		Random rand = new Random();
		Integer min = 0;
		Integer max = 10;
		Integer randomNum1 = null;
		Integer randomNum2 = null;
		String string = null;
		Integer numberCorrect = 0;		//number correct counter

		input = new Scanner(System.in);
		
		do{
			randomNum1 = rand.nextInt((max - min) + 1) + min;
			randomNum2 = rand.nextInt((max - min) + 1) + min;
			System.out.println(randomNum1 + " + " + randomNum2 + " = ?");
			string = input.nextLine();
			
			if(randomNum1 + randomNum2 == Integer.parseInt(string)) {
				numberCorrect += 1;
				System.out.println("Correct!    " + numberCorrect);
				
			}
			else{
				System.out.println("Incorrect...");
			}			
		}
		while (randomNum1 + randomNum2 == Integer.parseInt(string));
	}

}
