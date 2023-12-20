package Conceptss;

class Sample3 {
synchronized	void sam() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

synchronized void sa() {
		for (int i = 11; i <= 20; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Sampl extends Thread {
	Sample3 s;

	public Sampl(Sample3 s) {
		this.s = s;
	}

	public void run() {
		s.sa();
	}
}

class Samp extends Thread {
	Sample3 s;

	public Samp(Sample3 s) {
		this.s = s;
	}

	public void run() {
		s.sam();
	}
}

public class Threadss {
	public static void main(String[] args) {
		Sample3 s = new Sample3();
		Sampl s1 = new Sampl(s);
		Samp ss = new Samp(s);

		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(ss);
		t1.start();
		t2.start();

	}
}
