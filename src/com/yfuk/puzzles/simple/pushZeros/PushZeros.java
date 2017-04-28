package com.yfuk.puzzles.simple.pushZeros;

import java.util.Arrays;

public class PushZeros {

	public static void main(String[] str){
		int[] a = new int[]{1,0,3,0,7,0,4,5,6,0,0};
		System.out.println(new PushZeros().pushZeros(a));
		System.out.println(Arrays.toString(a));
	}
	
	public int pushZeros(int[] arr){
		int left=0;
		int right = arr.length -1;
		
		while(left <= right){
			if(arr[right] == 0){
				right--;
				continue;
			}
			if(arr[left] == 0){
				arr[left]=arr[right];
				arr[right]=0;
			}
			left++;
		}
		
		return right+1;
	}
}