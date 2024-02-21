package basics;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter any no");
		int n=sc.nextInt();
		int i;
		if(n==1)
		{
			System.out.println("prime starts from 2");
		}
		for(i=2;i<n;i++) {
			if(n%i==0)
			{
				System.out.println(n+"not a prime");
				
			}
			System.out.println(n+"is prime");
		}
		
		
	}
}
