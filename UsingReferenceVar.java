package IntailizingVaraibleTypes;

public class UsingReferenceVar// another name is obj for UsingReferenceVar
{

	String color;
	int age;

	public static void main(String[] args) {

		UsingReferenceVar us = new UsingReferenceVar();
		us.color = "blue";
		us.age = 15;
		System.out.println(us.color + " " + us.age);
	}

}
