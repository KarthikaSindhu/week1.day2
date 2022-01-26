package week1.day2;

public class Factorial {

	public static void main(String[] args) {

		int result = 1;
		int n = 10;

		for (int i = 1; i <= n; i++) {

			result = result * i;
			System.out.println(" " + result + " ");
		}
		System.out.print("Factorial of 10 :" + result + " ");
	}
}