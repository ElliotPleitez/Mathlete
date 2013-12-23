import java.awt.*;

public class MainWindow extends Frame{	
	private static final long serialVersionUID = 8161687471630404544L;
	public static void main(String[] args) {
		new MainWindow();
	}
	
	Label question = new Label();
	Label answer = new Label();

	public MainWindow(){
		this.setLayout(new GridLayout(1, 2));
		this.add(question);
		this.add(answer);

		new Mathlete(this);
		
		this.setTitle("Mathlete v1.0.0");
		this.setSize(225,150);
		this.setVisible(true);
	}
}
