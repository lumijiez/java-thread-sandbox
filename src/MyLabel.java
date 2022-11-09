import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class MyLabel extends JLabel {
 
    int nrShown = 0;
	
	MyLabel() {
		this.setForeground(new Color(0, 0, 0));
		this.setText(String.valueOf(nrShown));
		this.setFont(new Font("MV Boli", Font.PLAIN, 40));
		this.setVerticalAlignment(CENTER);
		this.setHorizontalAlignment(CENTER);
	}
}
