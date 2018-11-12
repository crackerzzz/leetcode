package leetcode;

public class ArrayPairSumBruteForce {

	private int sum(int[] array, int sum) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == sum) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(new ArrayPairSumBruteForce().sum(new int[] { 4, 7, 3, 9, 0, 1 }, 10));
	}

}
