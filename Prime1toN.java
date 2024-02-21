package basics;

import java.util.Scanner;

public class Prime1toN {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter any number");
		int n=sc.nextInt();
		System.out.println("prime no's b/w 1 and "+n);
		//loop through the no's 1 by 1 
		
		for(int i=1;i<n;i++)
		{
			boolean isPrime=true;
			//checking if no is prime
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
				
			}
			//print the no's
			if(isPrime) {
				System.out.println(i+" ");
			}
		}
		
	}

}
