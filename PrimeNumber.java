package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a = 13;
		for (int i = 2; i < 13; i++) {

			if (a % i == 0) {

				System.out.println(a + "NotPrime");

			}
			else
			{
			System.out.println(a + " " + "Prime Number");
			}

		}

	}

}
