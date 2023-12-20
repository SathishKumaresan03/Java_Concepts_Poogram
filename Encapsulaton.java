package Conceptss;
class s{
	private String age;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
public class Encapsulaton {
public static void main(String[] args) {
	s e= new s();
	e.setAge("12");
	System.out.println(e.getAge());
}

}
