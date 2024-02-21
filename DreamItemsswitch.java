import java.util.Scanner;

public class DreamItemsswitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
int n=sc.nextInt();
switch(n)
{
case 1:System.out.println("burger");
       break;
case 2:System.out.println("pani puri");
       break;
case 3:System.out.println("biryani");
       break;
case 4:System.out.println("vada pav");
        break;
default:System.out.println("wake up its dream");
}
	}
}
