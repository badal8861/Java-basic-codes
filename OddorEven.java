import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  a no to check odd or even");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println(n+"even no");
		else
			System.out.println(n+"odd no");
	}
}
