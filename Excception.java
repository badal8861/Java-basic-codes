
public class Excception {

	void main() {
		System.out.println("a");
	}
	public static void main(String[] args) {
		
		
			try {
			int a=10;
			int b=0;
			int c=a/b;
			
		System.out.println(c);
		
			}
			catch(ArithmeticException e) {
				e.printStackTrace();
				System.out.println("arithmetic");
			}
			
			Excception e=new Excception();
			e.main(); 
			System.out.println("arithmetic");
	
	}
}
