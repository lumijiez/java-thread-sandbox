import javax.swing.JPanel;
import java.awt.Color;

@SuppressWarnings("serial")
public class MyPanel extends JPanel {

	MyPanel(Color color, int x, int y, int height, int width) {
		this.setBackground(color);
		this.setBounds(x, y, height, width);	
	}

	MyPanel(Color color, int x, int y, int height, int width, MyLabel label) {
		this.setBackground(color);
		this.setBounds(x, y, height, width);
		this.add(label);		
	}

}
