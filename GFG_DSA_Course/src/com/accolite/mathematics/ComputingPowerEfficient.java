package com.accolite.mathematics;


//if pow is even -> pow(n/2)*pow(n/2)
//pow is odd -> pow(n/2) * pow(n/2) *x

public class ComputingPowerEfficient {
	
	public static void main(String[] args) {
		int n=3,x=5;
		int result=powerEfficient(n,x);
		System.out.println(result);
	}

	private static int powerEfficient(int x, int n) {
		if(n==0)
			return 1;
		int temp=powerEfficient(x, n/2);
		
		if(n%2 == 0)
			return temp*temp;
		else
			return temp*temp*x;
		
	}
	
}


//theta(log n)
//auxiliary space for function stack call - theta(log n)