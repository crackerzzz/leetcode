package hackerrank.projecteuler;

import java.util.Scanner;

public class No2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			System.out.println(fibSumOfEvenElements(n));
		}
	}

	public static long fibSumOfEvenElements(long n) {
		// handle edge case scenario
		if (n < 3) {
			return 0;
		} else if (n == 3) {
			return 2;
		}

		long a = 1l;
		long b = 2l;
		long c = a + b;
		long sum = 2l;

		while (c < n) {
			if ((c & 1) == 0) {
				sum += c;
			}
			a = b;
			b = c;
			c = a + b;
		}
		return sum;
	}

}