import java.util.Scanner;

public class TernaryOperatorPassOrFail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		String resultcard=(marks>=35)?"pass":"fail";
		System.out.println(resultcard);
	}
}
