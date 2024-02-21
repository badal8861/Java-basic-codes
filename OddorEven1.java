package basics;

import java.util.Scanner;

public class OddorEven1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("even"+n);}
			else {
				System.out.println("odd"+n);
		}
	}
}
