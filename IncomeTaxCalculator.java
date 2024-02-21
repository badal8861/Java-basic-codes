import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the income");
		int tax=0;
		int income=sc.nextInt();
		if(income<=500000) {
			tax=0;
			System.out.println("0% tax");
		}
			else if(income>500000 && income<100000) {
				tax=(int) (income*0.2);
				System.out.println(tax+" is 20% tax");
	}
	else
	{
		tax=(int)(income*0.3);
		System.out.println(tax+"is 30% tax");
	}
}
}