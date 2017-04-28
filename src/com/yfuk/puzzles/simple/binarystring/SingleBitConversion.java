package com.yfuk.puzzles.simple.binarystring;

public class SingleBitConversion {
	public static void main(String[] arg) {
		String sample = new SingleBitConversion().add("101", "11");
		System.out.println(sample);
	}

	public String add(String a, String b) {
		int count = 0;
		boolean extraBit = false;
		StringBuilder result = new StringBuilder(Math.max(a.length(), b.length()) + 1);

		while (count < a.length() || count < b.length()) {
			int aIndex = a.length() - count - 1;
			int bIndex = b.length() - count - 1;

			int i1 = (aIndex < 0) ? 0:(a.charAt(aIndex) - '0');
			int i2 = (bIndex < 0) ? 0:(b.charAt(bIndex) - '0');
			int res = i1 + i2 + (extraBit ? 1 : 0);

			extraBit = (res >> 1) == 1;
			int bit = res & 1;
			result.append(bit == 1 ? '1' : '0');
			count++;

		}
		if (extraBit)
			result.append('1');

		return result.reverse().toString();
	}
}
