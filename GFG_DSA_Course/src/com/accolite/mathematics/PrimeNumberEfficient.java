package com.accolite.mathematics;

public class PrimeNumberEfficient {

	//Divisor always occur in pair
	// 30 = (1*30) , (2*15), (3*10), (5*6)
	//x*y=n
	//if x<y, then x*x <n -> x <sqrt(n)
	public static void main(String[] args) {
		int num=13;
		boolean result=isPrimeEfficient(num);
		System.out.println(result);
		System.out.println(isPrimeEfficient(37));
		System.out.println(isPrimeEfficient(65));
	}

	private static boolean isPrimeEfficient(int num) {
		if(num==1)
			return false;
		for(int i=2;i*i<num;i++)
			if(num%i==0)
				return false;
		return true;
	}
}


//O(sqrt(n))