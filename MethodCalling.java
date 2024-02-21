package basic;

public class MethodCalling {

	public void dog() {
		System.out.println("bow bow...");
	}

	public void doggy() {
		System.out.println("mothi suzi...");
	}

	public static void main(String[] args) {

		MethodCalling m = new MethodCalling();
		m.dog();
		Birds b = new Birds();
		b.sound();
		m.doggy();
	}

}
