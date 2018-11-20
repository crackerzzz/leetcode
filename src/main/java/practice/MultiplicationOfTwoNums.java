package practice;

public class MultiplicationOfTwoNums {
	public static void main(String[] args) {
		System.out.println("Final sum is " + multiply(2147483647, 2));
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static int multiply(int a, int b) {
		int divisor = a;
		int operand = b;
		if (a > b) {
			divisor = b;
			operand = a;
		}

		int sum = 0;

		while (divisor >= 1) {
			// odd number
			if ((divisor & 1) == 1) {
				sum += operand;
			}

			// multiplication by 2
			operand = operand << 1;

			// division by 2
			divisor = divisor >> 1;

			System.out.println("divisor is " + divisor + ", operand is " + operand + ", sum is " + sum);

		}
		return sum;
	}
}
