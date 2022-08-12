package com.accolite.recursion;

/*
 given a rope length n, cut the rope into max number of piieces such that the length 
 can be a or b or c
 */
public class RopeCuttingProblem {
	public static void main(String[] args) {
		int n=5,a=2,b=5,c=1;
		int numOfRopes=numOfRopes(n,a,b,c);
		System.out.println(numOfRopes);
		System.out.println(numOfRopes(23, 12, 9, 11));
		 //n=23,a=12,b=9,c=11;
		 
	}

	private static int numOfRopes(int n, int a, int b, int c) {
		if(n==0)
			return 0;
		if(n<0)
			return -1;
		int max=Math.max(numOfRopes(n-a, a, b, c),numOfRopes(n-b, a, b, c));
		int res=Math.max(max, numOfRopes(n-c, a, b, c));
		
		if(res==-1)
			return -1;
		else
			return res+1;
	}
	
	private static int max(int a,int b,int c) {
		if(a>b && a>c) return a;
		else if(b>c) return b;
		else return c;
	}

}

//O(3^n)