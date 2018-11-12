package ctci.array_strings;

public class URLifyInplace {

	private void urlify(char[] cs, int trueLength) {
		int spacesCount = 0;
		int i = 0;
		for (; i < trueLength; i++) {
			if (cs[i] == ' ') {
				spacesCount++;
			}
		}
		
		// no spaces in true string, return
		if (spacesCount == 0) {
			return;
		}
		int index = trueLength + spacesCount * 2 - 1;
		System.out.println(index);

		for (int j = trueLength - 1; j >= 0; j--) {
			if (cs[j] == ' ') {
				cs[index] = '0';
				cs[index - 1] = '2';
				cs[index - 2] = '%';
				index = index - 3;
			} else {
				cs[index] = cs[j];
				index--;
			}
		}
	}

	private static int findTrueLength(char[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != ' ') {
				return i;
			}
		}
		return arr.length;
	}

	public static void main(String[] args) {
		char[] chrs = "My JohnSmith  ".toCharArray();
		int trueLength = findTrueLength(chrs);
		System.out.println("true Length: " + (trueLength + 1));
		new URLifyInplace().urlify(chrs, trueLength + 1);
		System.out.println(chrs);
	}

}
