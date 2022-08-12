package com.accolite.recursion;

public class _Problem6_TowerOfHanoi {
	public static void main(String[] args) {
		int n=3;
		long count=toh(n,1,3,2);
		System.out.println(count);
	}

	private static long toh(int n, int from, int to, int aux) {
		if(n==0)
			return 0;
		toh(n-1,from,aux,to); //abc->a,c,b
		System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
		toh(n-1,aux,to,from);//bac
		return (long) (Math.pow(2, n)-1);
	}

}
