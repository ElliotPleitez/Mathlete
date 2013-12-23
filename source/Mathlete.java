import java.awt.*;
import java.awt.event.*;

public class Mathlete {
	Label question;
	Label answer;
	int minimum = 0;
	int maximum = 10;
	Integer randomNumber1 = null;
	Integer randomNumber2 = null;
	
	public Mathlete(MainWindow gameScreen) {
		question = gameScreen.question;
		answer = gameScreen.answer;
		
		gameScreen.addKeyListener(new KeyboardEntry());
		
		StartGame();
	}
	
	public class KeyboardEntry extends KeyAdapter{		
		public void keyPressed(KeyEvent e){
			if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9'){
				if (answer.getText() != ""){
					answer.setText(answer.getText() + String.valueOf(e.getKeyChar()));
				}
				else{
					answer.setText(String.valueOf(e.getKeyChar()));					
				}
				if(VerifyQuestion()){
					NewQuestion();	
					answer.setText("");
				}
			}
			else{
				if (e.getKeyCode() == 27){
					answer.setText("");
				}
			}
		}
	}

	private void StartGame(){		
		Boolean myBoolean = Boolean.TRUE;
		while(myBoolean){
			NewQuestion();
			if(answer.getText() != ""){
				myBoolean = VerifyQuestion();
			}
			else{
				myBoolean = Boolean.FALSE;
			}
		}
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