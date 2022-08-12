package com.accolite.recursion;

public class TowerOfHanoi {
	public static void main(String[] args) {
		int n=3; //needs 7 steps to move from a to c
		char a='a',b='b',c='c';//a to c, with intermediate tower as b
		towerOfHanoi(n,a,b,c);
	}

	private static void towerOfHanoi(int n, char a, char b, char c) {
		if(n==0)
			return;
		towerOfHanoi(n-1, a, c, b);
		System.out.println("move "+n+" from "+a+" to "+c);
		towerOfHanoi(n-1, b, a, c);
		
	}

}

//number of movements- T(n)=2T(n-1)+1 = 1+2+4....=2^(n-1)-> sum=(1*(2^n)-1)/2-1 = 2^n-1