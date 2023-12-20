package Conceptss;

public class ThisCalling {

	public ThisCalling() {
        this(1);
		System.out.println("12345");
	}
	public ThisCalling(int a) {

		System.out.println("1");
	}
	public static void main(String[] args) {
		
		 ThisCalling calling=new ThisCalling();
		 
		
	}
	
}
