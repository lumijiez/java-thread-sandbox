import java.awt.Color;
import javax.swing.ImageIcon;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		MyLabel label = new MyLabel();
		MyLabel label2 = new MyLabel();
		MyLabel label3 = new MyLabel();

		MyPanel greenPanel = new MyPanel(Color.green, 250, 0, 250, 250, label);
		MyPanel redPanel = new MyPanel(Color.red, 0, 0, 250, 250, label2);
		MyPanel bluePanel = new MyPanel(Color.blue, 0, 250, 500, 250, label3);
		MyPanel controlPanel = new MyPanel(Color.yellow, 0, 500, 500, 250);

		MyRunnable runnable1 = new MyRunnable(label, 500, "one");
		MyRunnable runnable2 = new MyRunnable(label2, 200, "two");
		MyRunnable runnable3 = new MyRunnable(label3, 100, "three");
		MyRunnable2 runnable4 = new MyRunnable2(redPanel, bluePanel, greenPanel, label, label2, label3, MyConst.DEFAULT);

		WindowButtonHandler button7 = new WindowButtonHandler(runnable4, 200, 50);
		
        ThreadButtonHandler button1 = new ThreadButtonHandler(runnable1, 200, 100, "slower");
        ThreadButtonHandler button2 = new ThreadButtonHandler(runnable1, 200, 100, "faster");
        ThreadButtonHandler button3 = new ThreadButtonHandler(runnable2, 200, 100, "slower");
        ThreadButtonHandler button4 = new ThreadButtonHandler(runnable2, 200, 100, "faster");
        ThreadButtonHandler button5 = new ThreadButtonHandler(runnable3, 200, 100, "slower");
        ThreadButtonHandler button6 = new ThreadButtonHandler(runnable3, 200, 100, "faster");
        
        Thread numberThread1 = new Thread(runnable1);
		Thread numberThread2 = new Thread(runnable2);
		Thread numberThread3 = new Thread(runnable3);
		Thread windowThread = new Thread(runnable4);

        controlPanel.add(button1);
        controlPanel.add(button3);
        controlPanel.add(button5);
        controlPanel.add(button2);
        controlPanel.add(button4);
        controlPanel.add(button6);
		controlPanel.add(button7);

		MyFrame myFrame = new MyFrame(redPanel, greenPanel, bluePanel, controlPanel, new ImageIcon("logo.png"));

		numberThread1.start();
		numberThread2.start();
		numberThread3.start();
		windowThread.start();
		

	}

}
