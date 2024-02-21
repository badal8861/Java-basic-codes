
public class Employee {

	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setAge(12);
		e.setName("badal");
		System.out.println(e.getAge() + " " + e.getName());

	}
}