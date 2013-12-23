import java.util.Random;

public class Generator {
	public static Integer RandomInteger(Integer minimum, Integer maximum){
		Integer value = null;
		Random random = new Random();
		value = random.nextInt((maximum - minimum) + 1) + minimum;
		return value;
	}
	
	@SuppressWarnings("null")
	public static Integer[] RandomInteger(Integer minimum, Integer maximum, Integer length){
		Integer value[] = null;
		for(Integer i=0; i < length; i++) {
			value[i] = RandomInteger(minimum, maximum);
		}
		return value;
	}
	
	public static String RandomOperator(){
		String value = null;
				
		return value;
	}
	
	@SuppressWarnings("null")
	public static String[] RandomOperator(Integer length){
		String value[] = null;
		for(Integer i=0; i < length; i++) {
			value[i] = RandomOperator();
		}
		return value;
	}
}

/* Commented for when modulus is needed
	for(Integer i=0; i<randomNum.length; i++) {
		randomNum[i] = rand.nextInt((max - min) + 1) + min;
		if(randomNum[i] % 2 == 0) {
	
		}
		else {
		
		}
	}
*/