
public class ScoreKeeper {
	Integer level = null;
	Integer correct = null;
	Integer incorrect = null;
	Integer questions = null;
	
	public Integer GetScore(){
		
		return ( correct / questions ) * 100;
	}
}