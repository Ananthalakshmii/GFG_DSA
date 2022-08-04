package com.accolite.mathematics;

import java.util.Arrays;

public class SieveOfEratosthenesEfficientShorter {
	
	public static void main(String[] args) {
		int num=23;
		sieve(num);
	}

	private static void sieve(int num) { // initializing an array of size n+1 to true. and if the num is prime,making the multiples in the array as false
		boolean[] isPrime=new boolean[num+1];
		Arrays.fill(isPrime, true);
		
		for(int i=2;i<=num;i++) {
			if(isPrime[i]) { //goes inside only for prime numbers-- if array is already marked false, 
				//no need to check for multiples as it will already be marked false
				System.out.print(i+" ");
				for(int j=i*i;j<=num;j=j+i) { // replaced from j=2*i to j=i*i.. bcoz previous values would have the smaller divisors and would be false already
					isPrime[j]=false;
				}
			}
		}
		
	}

}


//O(n log log n) 
// which is much shorter than O(n sqrt(n)) in naive approach-- O(n^3/2)