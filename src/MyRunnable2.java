import java.awt.Color;
import java.util.Random;

public class MyRunnable2 implements Runnable {

	MyPanel panel, panel2, panel3;
	MyLabel label, label2, label3;
	String mode;
	Random rand = new Random();
	int modd = 0;
	boolean isAlive = true;

	MyRunnable2(MyPanel panel, MyPanel panel2, MyPanel panel3, MyLabel label, MyLabel label2, MyLabel label3,
			String mode) {
		this.panel = panel;
		this.panel2 = panel2;
		this.panel3 = panel3;
		this.mode = mode;
		this.label = label;
		this.label2 = label2;
		this.label3 = label3;
	}
	
	public void toggleThread() {
		   if (isAlive) isAlive = false;
		   else isAlive = true;
		}

	@Override
	public void run() {
		while (true) {
			if (isAlive) {
				if (mode == MyConst.RANDOM) {
					panel.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
					panel2.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
					panel3.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else if (mode == MyConst.B_W) {
					if (modd == 0) {
						panel.setBackground(Color.white);
						panel2.setBackground(Color.white);
						panel3.setBackground(Color.white);
						label.setForeground(Color.black);
						label2.setForeground(Color.black);
						label3.setForeground(Color.black);
						modd = 1;
					} else {
						panel.setBackground(Color.black);
						panel2.setBackground(Color.black);
						panel3.setBackground(Color.black);
						label.setForeground(Color.white);
						label2.setForeground(Color.white);
						label3.setForeground(Color.white);
						modd = 0;
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
