import java.awt.*;

public class MainWindow extends Frame{
	public static void main(String[] args) {
		new MainWindow();
	}
	
	private Label labelInput;
	public MainWindow(){
		this.setLayout(new FlowLayout());
		
		labelInput = new Label("Enter an Integer: ");
		this.add(labelInput);
		
		this.setTitle("Testing");
		this.setSize(300,400);
		this.setVisible(true);
	}
}
