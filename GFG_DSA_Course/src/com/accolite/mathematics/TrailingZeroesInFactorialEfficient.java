package com.accolite.mathematics;

public class TrailingZeroesInFactorialEfficient {
	public static void main(String[] args) {
		int num=100;
		
		int zeroes=trailingZeroesInFactorialEfficient(num);
		System.out.println(zeroes);
		System.out.println(trailingZeroesInFactorialEfficient(25));
	}

	private static int trailingZeroesInFactorialEfficient(int result) { //counting prime factorization - 5,10,15,...
		//5*5=25 = another sequence with interval 25
		//5*5*5=125 = another sequence with interval 125
		int count=0;
		for(int i=5;i<=result;i=i*5) {
			count=count+ (result/i);
			System.out.println("count result i "+count+" "+result+" "+i);
		}
		return count;
	}

}

//theta(log n)
//solves overflow - not computing factorial
// dividing number with multiples of 5