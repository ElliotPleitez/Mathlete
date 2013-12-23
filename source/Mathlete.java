import java.awt.*;
import java.awt.event.*;

public class Mathlete {
	Label questionLabel;
	Label answerLabel;
	Challenger challenger;
	//ScoreKeeper will assign these in the future
		int minimum = 0;
		int maximum = 10;
	//ScoreKeeper will assign these in the future
	
	public Mathlete(MainWindow gameScreen) {
		questionLabel = gameScreen.question;
		answerLabel = gameScreen.answer;
		
		gameScreen.addKeyListener(new KeyboardEntry());
		
		StartGame();
	}
	
	public class KeyboardEntry extends KeyAdapter{		
		public void keyPressed(KeyEvent e){
			if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9'){
				if (answerLabel.getText() != ""){
					answerLabel.setText(answerLabel.getText() + String.valueOf(e.getKeyChar()));
				}
				else{
					answerLabel.setText(String.valueOf(e.getKeyChar()));
				}
				if(Integer.valueOf(answerLabel.getText()) == challenger.Answer()){
					answerLabel.setText("");
					challenger = null;
					challenger = new Challenger(0, 10, Operator.Addition, Type.Integer);
					questionLabel.setText(challenger.Question());
				}
			}
			else{
				if (e.getKeyCode() == 27){
					answerLabel.setText("");
				}
			}
		}
	}

	private void StartGame(){
		challenger = new Challenger(0, 10, Operator.Addition, Type.Integer);
		questionLabel.setText(challenger.Question());

		//Boolean myBoolean = Boolean.TRUE;
		/*while(myBoolean){
			if(answerLabel.getText() != ""){
				myBoolean = Boolean.TRUE;
				if(answerLabel.getText() == challenger.Answer()){
					myBoolean = Boolean.TRUE;
				}
			}
			else{
				myBoolean = Boolean.FALSE;
			}
		}*/
		/*Generate dynamic array with questions to be asked, difficulty selected before hand*/
	}
}