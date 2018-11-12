package ctci.array_strings;

public class IsUniqueWithoutExtraDataStructure {

	private boolean isUnique(String str) {
		int bits = 0;
		for (char c : str.toCharArray()) {
			int value = c - 'a';
			int leftShift = 1 << value;

			if ((bits & leftShift) > 0) {
				return false;
			}
			bits |= leftShift;
			System.out.println(value + " - " + leftShift);
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new IsUniqueWithoutExtraDataStructure().isUnique("abcdef"));
	}

}
