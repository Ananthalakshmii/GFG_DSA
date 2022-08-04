package com.accolite.mathematics;

public class PrimeFactors {

	public static void main(String[] args) {
		int num=12;
		primeFactors(num);
	}

	private static void primeFactors(int num) {
		for(int i=2;i<num;i++) {
			if(isPrime(i)) {
				int x=i;
				while(num%x==0) {
					System.out.print(i+" ");
					x=x*i; //if 2, checking for 4 as well if it divides
				}
			}
		}
		
	}

	private static boolean isPrime(int num) {
		if(num==1)
			return false;
		if(num==2 ||num==3)
			return true;
		if(num%2==0 || num%3==0) //all even numbers are skipped for %2
			return false;
		for(int i=5;i*i<num;i+=6) // check initialization, break condition and increment condition
			if(num%i==0 || num%(i+2)==0) // doing 2 divisibility checks
				return false;
		return true;
	}
}

//O(n^2 log n)