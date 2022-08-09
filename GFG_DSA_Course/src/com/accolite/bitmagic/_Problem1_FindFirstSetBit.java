package com.accolite.bitmagic;

public class _Problem1_FindFirstSetBit {
	public static void main(String[] args) {
		int n=4;
		int result=findFirstSetBit(n);
		System.out.println(result);
	}

	private static int findFirstSetBit(int n) {
		int counter=(int) Math.sqrt(n);
		for(int i=0;i<=counter;i++) {
			if(((n>>i) & 1)==1)
				return i+1;
		}
		return 0;
		
	}

}
