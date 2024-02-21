package whileloop;

public class Print_sumof1toN {

	public static void main(String[] args) {

	int range=10;
	int count=1;
	int sum = 0;
		while(count<range)
		{
			System.out.print(count);
			sum=sum+count;
			count++;
		}
		System.out.println();
		System.out.println("sumof numebrs"+sum);
	}

}
