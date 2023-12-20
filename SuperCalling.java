package Conceptss;

class Sample {
	public Sample(int a) {
		System.out.println("up");
	}
}

public class SuperCalling extends Sample {
	public SuperCalling() {
		super(12);
		System.out.println("down");
	}

	public static void main(String[] args) {
		SuperCalling calling = new SuperCalling();

	}

}
