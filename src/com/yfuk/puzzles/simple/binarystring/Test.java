package com.yfuk.puzzles.simple.binarystring;

public class Test {
	public static void main(String[] args){
		SolutionWrapper noc = new SolutionWrapper(){
			NoConversion inst = new NoConversion();
			@Override
			public String add(String arg1, String arg2) {
				return inst.add(arg1, arg2);
			}
		};
		test(noc);
		
		SolutionWrapper sbc = new SolutionWrapper(){
			SingleBitConversion inst = new SingleBitConversion();
			@Override
			public String add(String arg1, String arg2) {
				return inst.add(arg1, arg2);
			}
		};
		test(sbc);
	}
	
	
	static interface SolutionWrapper{
		String add(String arg1, String arg2);
	}
	
	
    private static void test(SolutionWrapper solution){
    	for(int a=0;a<0x7;a++){
    		for(int b=0;b<0x7;b++){
    			String s1 = Integer.toBinaryString(a);
    			String s2 = Integer.toBinaryString(b);
    			String res = solution.add(s1, s2);
    			long test = Long.parseLong(res, 2);
    			if(test != a + b){
    				System.out.print("Error: ");
    			}
				System.out.println(s1 + " + " + s2 + " = " + res);
    		}
    	}
    }
}
