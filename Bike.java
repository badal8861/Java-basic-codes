package runtimepolymor;

public class Bike extends Vehicle {

	void run() {
		System.out.println("by petrol ");
	}
	public static void main(String[] args) {
		
		Bike b=new Bike();
		b.run();
	}
	
}
