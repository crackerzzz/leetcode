package practice;

public class BitVectors {

	public static void main(String[] args) {
//		setUnsetUsingMasking();
		integerOperation();
	}

	private static void integerOperation() {
		int x = 3;
		System.out.println(x + " - " + Integer.toBinaryString(x));

		// multiplication by 2
		int b = (x << 2);
		System.out.println(b + " - " + Integer.toBinaryString(b));

		// division by 2
		int c = (b >> 2);
		System.out.println(c + " - " + Integer.toBinaryString(c));

		int m = 67;
		System.out
			.println(m + " - " + Integer.toBinaryString(m) + " == " + (m - 1) + " - " + Integer.toBinaryString(m - 1));

	}

	private static void setUnsetUsingMasking() {
		int bitVector = 0;
		int[] setArr = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1 };
		for (int i = 0; i < setArr.length; i++) {
			if (setArr[i] == 1) {
				int mask = 1 << i;
				System.out.println(i + " - mask: " + Integer.toBinaryString(mask));
				bitVector |= mask;
			}
		}
		System.out.println(Integer.toBinaryString(bitVector));

		int[] unsetArray = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < unsetArray.length; i++) {
			if (unsetArray[i] == 1) {
				int mask = 1 << i;
				System.out.println(
						i + " - mask: " + Integer.toBinaryString(mask) + " - unmask: " + Integer.toBinaryString(~mask));
				bitVector &= ~mask;
			}
		}
		System.out.println(Integer.toBinaryString(bitVector));
	}

}
