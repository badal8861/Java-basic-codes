package compiletimepolymor;

public class Sum {

	void add() {
		System.out.println("simple adding method");
	}
	int add(int a) {
		System.out.println("adding method");
		return a;
	}
	void add(int a,int b) {
		System.out.println("adding 2 var's");
	}
	public static void main(String[] args) {

		Sum s=new Sum();
		s.add();
		s.add(1);
		s.add('2', 6);//automatic promotion
	}

}
