package basics;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int range,a=0,b=1,c;
		System.out.println("enter any no");
		Scanner sc=new Scanner(System.in);
		range=sc.nextInt();
		
		for(int i=1;i>=range;i++) {
			
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
