package com.yfuk.puzzles.simple.stringmutations;

import java.util.LinkedList;
import java.util.List;

public class RecursiveFind {
	public static void main(String[] args){
		System.out.println(getMutations("abcdef"));
	}
	
	private static List<CharSequence> getMutations(CharSequence s){
		List<CharSequence> result = new LinkedList<>();
		
		if(s.length() == 1){
			result.add(s);
		}
		else{
			for(int i=0;i<s.length();i++){
				CharSequence s1 = (i>0)?s.subSequence(0, i):"";
				CharSequence s2= (i<s.length()-1)?s.subSequence(i+1, s.length()):"";
			   
			    StringBuilder sb = new StringBuilder(s.length()-1);
			    List<CharSequence> tails = getMutations(sb.append(s1).append(s2));
			    for(CharSequence tail:tails){
				    StringBuilder res = new StringBuilder(tail.length()+1);
                    res.append(s.charAt(i)).append(tail);
                    result.add(res);
			    }
			}
		}
		return result;
	}
}
