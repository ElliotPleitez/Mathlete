import java.awt.*;

public class Mathlete {
	Label question;
	Label answer;
	int minimum = 0;
	int maximum = 10;
	Integer randomNumber1 = null;
	Integer randomNumber2 = null;
		
	public Mathlete(Label question, Label answer) {
		StartGame(question, answer);
	}

	private void StartGame(Label QuestionLabel, Label AnswerLabel){
		question = QuestionLabel;
		answer = AnswerLabel;
		/*Generate dynamic array with questions to be asked, difficulty selected before hand*/
	}
	
	public void NewQuestion(){
		randomNumber1 = Generator.RandomInteger(minimum, maximum);
		randomNumber2 = Generator.RandomInteger(minimum, maximum);

		question.setText(randomNumber1 + " + " + randomNumber2 + " = ");
	}
	
	public boolean VerifyQuestion(){
		if(randomNumber1 + randomNumber2 == Integer.parseInt(answer.getText())) {
			return Boolean.TRUE;
		}
		else{
			return Boolean.FALSE;
		}
	}
}