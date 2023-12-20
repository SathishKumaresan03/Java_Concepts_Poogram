package Conceptss;

class Sample1 {
	static void Over(int a) {

		System.out.println(a);
	}

	static void Over(String a) {
		System.out.println(a);
	}

	static void Over(int a, String b) {
		System.out.println(a + " " + b);
	}

	static void Over(String b, int a) {
		System.out.println(b + " " + a);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		Sample1 sample1 = new Sample1();
		sample1.Over(1);
		sample1.Over("Sa");
		sample1.Over(1, "sa");
		sample1.Over("sa", 2);
	}
}
