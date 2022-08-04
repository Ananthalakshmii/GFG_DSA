package com.accolite.mathematics;

public class _Problem8_Exactly3Divisors {
	public static void main(String[] args) {
		int num=999999;
		int result=exactly3Divisors(num);
		System.out.println(result);
	}

	private static int exactly3Divisors(int N) {
		int count=0;
		for(int i=2;i*i<=N;i++) {
			if(isPrime(i) && i*i<=N) { // from 2 to sqrt n, if the number is prime and if the sq is also within the range in N,
				//there is one more divisor in prime adding to 3. so exactly 3 divisors count is added
				//System.out.print(i+" ");
				
				count++;
			}
		}
		return count;
	}

	private static boolean isPrime(int N) {
		if(N==1)
			return false;
		if(N==2 || N==3)
			return true;
		if(N%2==0 || N%3==0)
			return false;
		for(int i=5;i*i<=N;i+=6) {
			if(N%i==0 || N%(i+2)==0)
				return false;
		}
		return true;
	}

}
