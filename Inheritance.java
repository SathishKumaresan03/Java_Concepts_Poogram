package Conceptss;

class first {
	int a = 1;
}

class Second extends first {
	int b = 2;
}

class third extends Second {
	void ab() {
		System.out.println("3");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		third d = new third();
		d.ab();
		System.out.println(d.a);
		System.out.println(d.b);
	}
}
