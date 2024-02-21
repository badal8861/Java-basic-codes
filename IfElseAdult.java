import java.util.Scanner;

public class IfElseAdult {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		//if-else
		if(age>=18) {
		System.out.println("adult");
		{
		if(age>=13 && age<18)
			System.out.println("teenager");
		}
		}
		else
		{	
		System.out.println("child");
	}
}}
//		//else-if
//		if(age>=18)
//			System.out.println("adult");
//		else if(age>=13 && age<18)
//			System.out.println("teenager");
//		else
//			System.out.println();
//	}
//
//}
