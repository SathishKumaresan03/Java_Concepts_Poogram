package Conceptss;

class Animal{
	void somenoice(){
		System.out.println("somenoise");
	}
}
class cat extends Animal{
	void somenoice(){
		System.out.println("meow");
	}
}
class dog extends Animal{
	void somenoice(){
		System.out.println("bow bow");
	}
}
class stumilator{
	static void ansim(Animal a)
	{
		a.somenoice();
	}
}
public class Polymorphism {
  public static void main(String[] args) {
	cat cat=new cat();
	dog d = new dog();
	stumilator.ansim(cat);
	stumilator.ansim(d);
}
}
