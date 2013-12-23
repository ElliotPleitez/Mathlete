
public class Challenger {
	Integer minimum = null;
	Integer maximum = null;
	Operator operator = null;
	Type type = null;
	
	Integer NumberOne[] = null;
	Integer NumberTwo[] = null;
	
	public Challenger(Integer minimum, Integer maximum, Operator operator, Type type){
		this.minimum = minimum;
		this.maximum = maximum;
		this.operator = operator;
		this.type = type;
		
		if(operator == null){
			operator = Operator.values()[Generator.RandomInteger(0, Operator.values().length)];
		}
		else{
			operator = this.operator;
		}
		
		switch(type){
		case Integer: case Float:
			NumberOne = Generator.RandomInteger(minimum, maximum, 1);
			NumberTwo = Generator.RandomInteger(minimum, maximum, 1);
			break;
		case Fraction: case SquareRoot:
			NumberOne = Generator.RandomInteger(minimum, maximum, 2);
			NumberTwo = Generator.RandomInteger(minimum, maximum, 2);
			break;
		default:
			System.out.println("Operator not found.");
			break;
		}
	}
	
	public String Question(){
		String value = null;
		switch(type){
		case Integer:
			value =	NumberOne[0] + " + " + NumberTwo[0];
			break;
		default:
			value = "";
			System.out.println("Question not yet available.");
			break;
		}
		return value;
	}
	
	public String Answer(){
		String value = null;
		switch(type){
		case Integer:
			value = Integer.toString(NumberOne[0] + NumberTwo[0]);
			break;
		default:
			value = "";
			System.out.println("Answer not yet available");
			break;
		}
		return value;
	}
}
