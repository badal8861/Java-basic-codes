package basics;

import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("/enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			
		}
		System.out.println();
	
	}
	

}
