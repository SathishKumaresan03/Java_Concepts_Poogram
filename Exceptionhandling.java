package Conceptss;

class Sa{
	void hii() {
		try{
		int a=1/0;
		}
		catch(ArithmeticException e){
			System.out.println("h");
			e.fillInStackTrace();
		}
	}
}
public class Exceptionhandling {
   public static void main(String[] args) {
	Sa i=new Sa();
	i.hii();
}
}
