package Conceptss;
class hi{
	int a=0;
}
class bye extends hi{
	int b=789;
}
public class TyppeCasting {
public static void main(String[] args) {
	hi h=new bye();
	System.out.println(h.a);
	bye b=(bye) h;
	System.out.println(b.a);
	System.out.println(b.b);
	
}
}
