package com.accolite.bitmagic;

/*
 x^0 = x
 x^y= y^x
 x^(y^z)=(x^y)^z
 x^x=0
 */
public class OnlyOneOddOccuringEfficient {

	
	public static void main(String[] args) {
		int[] arr= {4,3,4,4,4,5,5};
		int result=oddOccuring(arr);
		System.out.println(result);
	}

	private static int oddOccuring(int[] arr) {
		int result=0;
		for(int i=0;i<arr.length;i++)
			result=result^arr[i];
		return result;
	}
}


//O(n)
//Auxiliary space: O(1)