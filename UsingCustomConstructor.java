package IntailizingVaraibleTypes;

public class UsingCustomConstructor {

	String name;
	public UsingCustomConstructor() {
		System.out.println("custom constructor");
	}
	
	public static void main(String[] args) {
		
		UsingCustomConstructor uc=new UsingCustomConstructor();
		System.out.println(uc.name);
	}
}
