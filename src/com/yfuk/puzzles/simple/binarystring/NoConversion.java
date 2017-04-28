package com.yfuk.puzzles.simple.binarystring;

public class NoConversion {
	public static void main(String[] arg) {
		String sample = new NoConversion().add("10", "1");
		System.out.println(sample);
	}

	public String add(String a, String b) {
		int count = 0;
		boolean extraBit = false;
		StringBuilder result = new StringBuilder(Math.max(a.length(), b.length()) + 1);

		while (count < a.length() || count < b.length()) {
			int aIndex = a.length() - count - 1;
			int bIndex = b.length() - count - 1;

			char aBit = (aIndex < 0) ? '0':a.charAt(aIndex);
			char bBit = (bIndex < 0) ? '0':b.charAt(bIndex);
			
			char res = (aBit != bBit)?extraBit?'0':'1':extraBit?'1':'0';
			result.append(res);
			extraBit = (aBit == '1' && bBit == '1') || (extraBit && (aBit == '1' || bBit == '1'));
			
			count++;

		}
		if (extraBit)
			result.append('1');

		return result.reverse().toString();
	}


}
