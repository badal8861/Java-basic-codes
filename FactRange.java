package basics;

public class FactRange {

	public static void main(String[] args) {

		int k = 4;

		for (int i = 1; i <= k; i++) {
			System.out.println(i + "!--->" + fact(i));
		}
	}

	static int fact(int n) {
		int fact = 1;

		while (n > 0) {
			fact = fact * n;
			n--;
		}
		return fact;

	}
}
