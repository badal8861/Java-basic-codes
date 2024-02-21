import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two to perform calculation");
		int a=sc.nextInt();
		int b=sc.nextInt();
		char operator=sc.next().charAt(0);
		
		switch(operator)
		{
		case '+':System.out.println(a+b +"addition");
		break;
		case '-':System.out.println(a-b +"substraction");
		break;
		case '/':System.out.println(a/b+"division");
		break;
		case '*':System.out.println(a*b +"multiplication");
		break;
		case '%':System.out.println(a%b +"remainder");
		break;
		default:System.out.println("entered wrong character");
		
		}
	}
}
