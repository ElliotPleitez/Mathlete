import java.awt.*;
import java.awt.event.*;

public class MainWindow extends Frame{
	private static final long serialVersionUID = 8161687471630404544L;
	public static void main(String[] args) {
		new MainWindow();
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
				if(mathlete.VerifyQuestion()){
					mathlete.NewQuestion();	
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
	
	Label question = new Label();
	Label answer = new Label();
	Mathlete mathlete = new Mathlete(question, answer);
	
	public MainWindow(){
		this.addKeyListener(new KeyboardEntry());
		
		this.setLayout(new GridLayout(1, 2));
		this.add(question);
		this.add(answer);
	
		Boolean myBoolean = Boolean.TRUE;
		while(myBoolean){
			mathlete.NewQuestion();
			if(answer.getText() != ""){
				myBoolean = mathlete.VerifyQuestion();
			}
			else{
				myBoolean = Boolean.FALSE;
			}
		}

		this.setTitle("Mathlete v1.0.0");
		this.setSize(225,150);
		this.setVisible(true);
	}
}
