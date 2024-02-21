package converting;

public class Dec2Bin {

	public static void dec2bin(int n)
	{
		int myNum=0;
		int pow=0;
		int binNum=0;
		
		while(n>0)
		{
			int rem=n%2;
			binNum=binNum+(rem*(int)Math.pow(10, pow));
			pow++;
			n=n/2;
		}
		System.out.println("binary form of"+n+"="+binNum);
	}
	public static void main(String[] args) {
		dec2bin(10);
	}
}
