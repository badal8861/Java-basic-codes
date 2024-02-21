package whileloop;

public class ReverseNumberStoreInVaraible {

	public static void main(String[] args) {

		int n = 23456;
		int rev = 0;

		while (n > 0)

		{
			int lastDigit = n % 10;//mod
			rev = (rev * 10) + lastDigit;//(0*10)+6=6
			//(6*10)+5=65;
			//(65*10)+4=654;
			//(654*10)+3=6543;
			//(6543*10)+2=65432
			n = n / 10; //2345

		}
		System.out.println(rev);
	}
}