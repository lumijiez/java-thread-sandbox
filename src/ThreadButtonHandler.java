import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class ThreadButtonHandler extends JButton implements ActionListener {

	MyRunnable runn;
    int isAlive = 0;
    String mode;
	int currentMode = 0;
    
	ThreadButtonHandler(MyRunnable runn, int x, int y, String mode) {
		this.setText("Thread " + runn.threadName + " " + mode);
		this.runn = runn;
		this.setBounds(x, y, 50, 50);
		this.addActionListener(this);
		this.mode = mode;
	}

	public int getMode(int x) {
		return MyConst.MODES[x];
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this) {
			if (mode == "slower") {
				if (this.currentMode+1 > MyConst.NR_MODES) {
				} else {
					this.currentMode =+ 1;
					this.runn.interv = getMode(this.currentMode);
				}
			} else {
				if (this.currentMode == 0) {
			} else {
				this.currentMode =- 1;
				this.runn.interv = getMode(this.currentMode);
			}
		}
	}
}
}
