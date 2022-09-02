package com.accolite.arrays;

public class _Problem27_FractionTrouble_TODO { //cant understand
	public static void main(String[] args) {
		int[] result=LargestFraction(2,53);
		System.out.println(result[0]+" "+result[1]);
		int[] result1=LargestFraction(1,8);
		System.out.println(result1[0]+" "+result1[1]);
	}

	private static int[] LargestFraction(int n, int d) {
	       int num = 0;
	       int den = 1;
	       for (int q = 10000; q >= 2; q--){
	           int p = (n * q - 1) / d;
	           if (p * den >= num * q)
	           {
	               den = q;
	               num = p;
	           }
	       }
	       int tot = gcdnumber(num,den);
	       int [] ans = new int[2];
	       ans[0] = num/tot;
	       ans[1] = den/tot;
	       return ans;
	   }
	   
	   static int gcdnumber(int a, int b)
	   {
	       if (b == 0)
	           return a;
	       return gcdnumber(b, a % b);
	   }

}
