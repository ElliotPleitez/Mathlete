import java.util.Random;
import java.util.Scanner;


public class Math {
	
		private static Scanner input;

				
		public static void ranSelect(Integer Input) {							//select random number, the length of the set is the input
			Integer numberSet = Input;
			Random rand = new Random();
			Integer min = 0;
			Integer max = 10;
			Integer randomNum[];
			Integer randomOp[];
			String string = null;	
			Integer numberCorrect = 0;											//number correct counter
			
			
			input = new Scanner(System.in);
			
			for(Integer i=0; i == numberSet; i++) {
				randomNum[i] = i;
			}
			
			for(Integer i=0; i<randomNum.length; i++) {							//select random numbers
				randomNum[i] = rand.nextInt((max - min) + 1) + min;
				
				if(randomNum[i] % 2 == 0) {
					
				}else{
					
				}
			}
			
			
			
			
			
			System.out.println();
			string = input.nextLine();
		}

		public static void readOut() {									//read out on screen the operations and numbers
			
		}
	

}
