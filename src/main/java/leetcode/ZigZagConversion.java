package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/***
 * 
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility) <code>
		P   A   H   N
		A P L S I I G
		Y   I   R
		
		P	S	G
		A	H
		P I I N
		A	R
		L	I
</code> And then read line by line: "PAHNAPLSIIGYIR" Write the code that will
 * take a string and make this conversion given a number of rows:
 * 
 * string convert(string text, int nRows); convert("PAYPALISHIRING", 3) should
 * return "PAHNAPLSIIGYIR".
 * 
 * convert("PAYPALISHIRING", 5) should
 * return "PSGAHPIINARLI".
 * 
 * @author shreejwal.shrestha
 *
 */
@RunWith(value = Parameterized.class)
public class ZigZagConversion {
	private final String inputString;
	private final String expectedOutput;
	private final Solution solution = new Solution();

	public ZigZagConversion(String inputString, String expedtedOutput) {
		this.inputString = inputString;
		this.expectedOutput = expedtedOutput;
	}

	@Parameters
	public static Iterable<Object[]> getParameters() {
		return Arrays.asList(new Object[][] { { "abcabcbb", 3 }, { "bbbbb", 1 }, { "pwwkew", 3 }, { "pwwpkew", 4 },
				{ "abadecbb", 5 }, { "abcdefab", 6 } });
	}

	@Test
	public void testConversion() {
		String output = solution.convert(inputString, 5);
		System.out.printf("Testing input: %2s, expected: %s, calculated: %s%n", inputString, expectedOutput, output);
		// Assert.assertEquals(expectedOutput, output);
	}

	static class Solution {
		
		public String convert(String inputString, int rows) {
			final char[][] result = new char[rows][inputString.length() / (rows - 1) + 1];
			int row = 0, col = 0;
			int mid = rows / 2;
			for (char c : inputString.toCharArray()) {
				if (row < rows) {
					result[row][col] = c;
					if (row + 1 <= rows) {
						// move to next row
						row++;
					}
				} else {
					col++;// move to next column
					row = 0; // restart row from 0
					result[mid][col] = c;
					col++;// move to next column
				}
			}

			List<Character> list = new ArrayList<>(inputString.length());
			for (int i = 0; i < result.length; i++) {
				System.out.println("");
				for (int j = 0; j < result[i].length; j++) {
					if (result[i][j] != '\u0000') {
						System.out.print(result[i][j] + " ");
						list.add(result[i][j]);
					} else {
						System.out.print("  ");
					}
				}
			}

			System.out.println("Result is " + list);
			return list.stream().map(Object::toString).collect(Collectors.joining());
		}
		
		public String convert2n(String inputString, int rows) {
			final char[][] result = new char[rows][inputString.length() / (rows - 1)];
			int row = 0, col = 0;
			int mid = rows / 2;
			for (char c : inputString.toCharArray()) {
				if (row < rows) {
					// move to next row
					result[row][col] = c;
					if (row + 1 <= rows) {
						row++;
					}
				} else {
					col++;// move to next column
					row = 0; // restart row from 0
					result[mid][col] = c;
					col++;// move to next column
				}
			}

			List<Character> list = new ArrayList<>(inputString.length());
			for (int i = 0; i < result.length; i++) {
				System.out.println("");
				for (int j = 0; j < result[i].length; j++) {
					if (result[i][j] != '\u0000') {
						System.out.print(result[i][j] + " ");
						list.add(result[i][j]);
					} else {
						System.out.print("  ");
					}
				}
			}

			System.out.println("Result is " + list);
			return list.stream().map(Object::toString).collect(Collectors.joining());
		}
	}

	public static void main(String[] args) {
		new ZigZagConversion("PAYPALISHIRING", "PAHNAPLSIIGYIR").testConversion();
	}
}
