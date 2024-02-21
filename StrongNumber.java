package basics;

public class StrongNumber {

	public static void main(String[] args) {

		int n = 145, sum = 0;
		int fact = 1; 
		int org = n;
		while (n > 0)// 145>0
		{
			n = n % 10;
			for (int i = n; i >= 1; i--) {
				fact = fact * i;

			}
			sum = sum + fact;
			n = n / 10;

		}
		if (n == sum) {
			System.out.println(n + "strong");
		}
	}
}
