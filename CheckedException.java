package Conceptss;

class olaException extends Exception {
	private String msg;

	public olaException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
}

public class CheckedException {

	static void ride(int no) throws olaException {
		if (no >= 18) {
			System.out.println("ride");
		} else {
			throw new olaException("invalid");
		}
	}

	public static void main(String[] args) throws olaException {
		try {
			ride(13);
		} catch (olaException e) {
			System.out.println(e.getMsg());
		}
	}

}
