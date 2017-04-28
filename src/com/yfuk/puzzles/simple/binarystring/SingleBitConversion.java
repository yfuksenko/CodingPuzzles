package com.yfuk.puzzles.simple.binarystring;

public class SingleBitConversion {
	public static void main(String[] arg) {
		String sample = new SingleBitConversion().add("101", "11");
		System.out.println(sample);
	}

	public String add(String a, String b) {
		int count = 0;
		int res = 0;
		StringBuilder result = new StringBuilder(Math.max(a.length(), b.length()) + 1);

		while (count < a.length() || count < b.length()) {
			
			int aIndex = a.length() - count - 1;
			int bIndex = b.length() - count - 1;

			if(aIndex >= 0){
				res += a.charAt(aIndex) - '0';
			}
			
			if(bIndex >= 0){
				res += b.charAt(bIndex) - '0';
			}
			result.append(res & 1);
			res = res >>> 1;
			count++;

		}
		if (res == 1)
			result.append('1');

		return result.reverse().toString();
	}
}
