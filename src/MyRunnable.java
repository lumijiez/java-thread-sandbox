
public class MyRunnable implements Runnable {

	MyLabel lab;
	int interv = 0;
	String threadName;

	MyRunnable(MyLabel lab, int interv, String threadName) {
		this.lab = lab;
		this.interv = interv;
		this.threadName = threadName;
	}

	@Override
	public void run() {
		while (true) {
			this.lab.nrShown++;
			lab.setText(String.valueOf(this.lab.nrShown));
			if (interv == 0)
				continue;
			else {
				try {
					Thread.sleep(interv);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}
}
