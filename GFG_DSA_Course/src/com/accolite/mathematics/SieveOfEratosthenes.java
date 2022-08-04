package com.accolite.mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {
	
	public static void main(String[] args) {
		int num=23;
		sieve(num);
	}

	private static void sieve(int num) { // initializing an array of size n+1 to true. and if the num is prime,making the multiples in the array as false
		boolean[] isPrime=new boolean[num+1];
		Arrays.fill(isPrime, true);
		
		for(int i=2;i*i<=num;i++) {
			if(isPrime[i]) { //goes inside only for prime numbers-- if array is already marked false, 
				//no need to check for multiples as it will already be marked false
				for(int j=2*i;j<=num;j=j+i) {
					isPrime[j]=false;
				}
			}
		}
		
		for(int i=2;i<=num;i++) {
			if(isPrime[i])
				System.out.print(i+" ");
		}
		
	}

}
