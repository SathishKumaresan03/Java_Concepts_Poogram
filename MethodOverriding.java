package Conceptss;
class One{
	void oqw(){
		System.out.println("one");
	}
}
class Two extends One{
	void oqw(){
		super.oqw();
		System.out.println("o");
	}
}
public class MethodOverriding {
public static void main(String[] args) {
	Two two=new Two();
	two.oqw();
	
	
}
}
