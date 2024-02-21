package IntailizingVaraibleTypes;

public class UsingParamtereConstructor {

	String name;
	int age;
	
	public UsingParamtereConstructor(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		
		UsingParamtereConstructor up1=new UsingParamtereConstructor("Badal",101);
		UsingParamtereConstructor up2=new UsingParamtereConstructor("Abhi",102);
		System.out.println(up1.name+" "+up1.age+" "+up2.name+" "+up2.age);

		
	}
}
