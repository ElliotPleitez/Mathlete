import java.awt.Label;
import java.awt.event.*;

public class Mathlete {
	/*public class KeyboardEntry extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9'){
				if (answer.getText() != ""){
					answer.setText(answer.getText() + String.valueOf(e.getKeyChar()));
				}
				else{
					answer.setText(String.valueOf(e.getKeyChar()));					
				}
			}
			else{
				if (e.getKeyCode() == 27){
					answer.setText("");
				}
			}
		}
	}*/
	
	
	public Mathlete(Label question, Label answer) {
		StartGame(question, answer);
	}

	private void StartGame(Label question, Label answer){
		int minimum = 0;
		int maximum = 10;
		Integer randomNumber1 = null;
		Integer randomNumber2 = null;
		do{
			randomNumber1 = Generator.RandomInteger(minimum, maximum);
			randomNumber2 = Generator.RandomInteger(minimum, maximum);
			
			question.setText(randomNumber1 + " + " + randomNumber2 + " = ");

/*
			if(randomNumber1 + randomNumber2 == Integer.parseInt(string)) {
				System.out.println("Correct!    " + numberCorrect);
			}
*/
		}
		while (randomNumber1 + randomNumber2 == Integer.parseInt("0"));
	}
}
