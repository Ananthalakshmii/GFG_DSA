package com.accolite.mathematics;

public class LCM_LeastCommonMultiple {

	public static void main(String[] args) {
		int a=4,b=6;
		int result=lcm(a,b);
		System.out.println(result);
	}

	private static int lcm(int a, int b) { //lcm will be greater than or equal to larger of 2 numbers
		int result=Math.max(a, b);
		while(true) {
			if(result%a==0 && result%b==0)
				return result;
			else
				result++;
		}
	
	}
}


//O(a*b - max(a,b))