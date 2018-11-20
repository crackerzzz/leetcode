package practice;

public class FibRecursive {
	public static void main(String[] args) {
		int n = 10;

		for (int i = 1; i <= n; i++) {
			System.out.println(i + " => " + fib(i));
		}
	}

	public static int fib(int n) {
		if (n <= 1) {
			return n;
		}

		return fib(n - 1) + fib(n - 2);
	}
}
