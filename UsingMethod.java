package IntailizingVaraibleTypes;

public class UsingMethod {

	String color;
	int age;

	public void InitObj(String s, int a) {

		color = s;
		age = a;
	}

	public void display() {
		System.out.println(color + " " + age);
	}

	public static void main(String[] args) {

		UsingMethod us = new UsingMethod();
		us.InitObj("Blue", 15);
		us.display();
	}
}
