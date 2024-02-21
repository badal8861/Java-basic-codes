
public class Car implements IVehicle,IlargeVehicle{

	public void starting() {
		System.out.println("by diesel");
	}
	public void Lstart() {
		System.out.println("lorry ");
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.starting();
		c.Lstart();
	}
}


