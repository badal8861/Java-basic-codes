import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n enter a number to check its a leap year or not");
		int y = sc.nextInt();
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)

			System.out.println("leap year" + y);
		else
			System.out.println("not a leap year" + y);

	}
}
