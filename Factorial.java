package methods;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		fact(n);
	}

	public static void fact(int n) {
		int fact = 1;
		{
			for (int i = 1; i <= 5; i++) {
				fact = (fact * i);
			}
			System.out.println("factorial of "+n+" is "+fact);
		}

	}
}
