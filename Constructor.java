package Conceptss;

public class Constructor {
	int ab;
public Constructor(int ab) {
	this.ab=ab;
}
public static void main(String[] args) {
	Constructor constructor=new Constructor(1);
	System.out.println(constructor.ab);
}
}
