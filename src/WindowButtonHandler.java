import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class WindowButtonHandler extends JButton implements ActionListener {

	MyRunnable2 runn2;
    int mode = 0;
    
	WindowButtonHandler(MyRunnable2 runn2, int x, int y) {
		this.setText("Mode: " + MyConst.DEFAULT);
		this.runn2 = runn2;
		this.setBounds(x, y, 50, 50);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this) {
			if (this.runn2.mode == MyConst.B_W) {
				this.runn2.mode = MyConst.RANDOM;
				this.setText("Mode: RANDOM");
				mode = 1;
			} else if (this.runn2.mode == MyConst.RANDOM) {
				this.runn2.mode = MyConst.B_W;
				this.setText("Mode: B_W");
				mode = 0;
			}
		    
		}
	}
}
