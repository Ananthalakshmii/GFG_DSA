package com.accolite.arrays;

public class _Problem30_NumberGame {
	public static void main(String[] args) {
		Long n=3L;
		Long result=numGame(n);
		System.out.println(result);
		System.out.println(numGame(4L));
		System.out.println(numGame(100000L)); //690585854
	}

	private static Long numGame(Long n) {
		if(n==1)
			return n;
		Long ans=1L;
		Long mod=(long) Math.pow(10, 9)+7;
		
		for(Long i=1L;i<=n;i++) {
			ans= (ans*i)/gcd(i,ans) %mod;
		}
		return ans;
	}

	private static Long gcd(Long a, Long b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
		
	}

}
