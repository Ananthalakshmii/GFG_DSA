package com.accolite.mathematics;

public class LCM_Efficient {

	public static void main(String[] args) {
		int a=4,b=6;
		int result=lcmEfficient(a,b);
		System.out.println(result);
	}

	private static int lcmEfficient(int a, int b) { //eucliedean algorithm
		// formula - (a*b) = GCD(a,b) * LCM(a,b)
		// -> LCM(a,b) = (a*b)/ GCD(a,b)
		
		int gcd=gcd_Euclidean(a,b);
		int lcm= (a*b)/gcd;
		return lcm;
	
	}

	private static int gcd_Euclidean(int a, int b) { //O(log(min(a,b))
		if(b==0)
			return a;
		return gcd_Euclidean(b, a%b);
	}
}


//O(log(min(a,b))