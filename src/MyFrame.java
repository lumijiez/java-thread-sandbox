import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	MyFrame(MyPanel panel, MyPanel panel2, MyPanel panel3, MyPanel panel4, ImageIcon img1) {
		this.setSize(500, 750);
		this.setResizable(true);
		this.setVisible(true);
		this.setIconImage(img1.getImage());
		this.setTitle("Oukeien");
		this.add(panel);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
