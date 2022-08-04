package com.accolite.mathematics;

public class FactorialOfANumberRecursive {
	
	public static void main(String[] args) {
		int num=4;
		int result=recursiveFactorial(num);
		System.out.println(result);
	}

	private static int recursiveFactorial(int num) {
		if(num==0)
			return 1;
		return num*recursiveFactorial(num-1);
		
	}

}

//T(n)=theta(n)+T(n-1)
//theta(n)
//auxilary space= theta(n) to store in stack
//extra overhead