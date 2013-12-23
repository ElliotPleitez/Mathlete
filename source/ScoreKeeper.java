
public class ScoreKeeper {
	public static Integer numberCorrect = 0;
	public static Integer numberIncorrect = 0;
	public static Integer questions = 0;
	
	public static Integer GetScore(){
		return ( numberCorrect / questions ) * 100;
	}
}