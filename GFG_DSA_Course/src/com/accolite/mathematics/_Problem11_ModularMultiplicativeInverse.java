package com.accolite.mathematics;

public class _Problem11_ModularMultiplicativeInverse {
	public static void main(String[] args) {
		int a=10,m=17;
		int modInv=modInverse(a,m);
		System.out.println(modInv);
	}

	private static int modInverse(int a, int m) {
		for(int i=0;i<m;i++) {
			if((a*i)%m==1)
				return i;
		}
		return -1;
	}

}
