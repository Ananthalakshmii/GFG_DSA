package com.accolite.bitmagic;

//You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).

//TODO- O(LogN)-----------------------------------
public class _Problem4_CountTotalSetBits_TODO {
	public static void main(String[] args) {
		int N=4;
		int count=countSetBits(N);
		System.out.println(count);
	}

	private static int countSetBits(int n) {
		int count=0;
		
		for(int i=1;i<=n;i++) {
			count=count+countSetBitUtil(i);
			System.out.println(i+" "+count);
			/*
			  int temp=i; 
			  while(temp>0) { 
			  temp= temp &(temp-1); 
			  count++; 
			  }
			 */
			
		}
		
		return count;
	}

	private static int countSetBitUtil(int i) {
		if(i<=0)
			return 0;
		if(i%2==0)
			return 0+countSetBitUtil(i/2);
		else
			return 1+countSetBitUtil(i/2);
		
		//return (i%2 == 0 ? 0: 1)+countSetBitUtil(i/2);
	}

}
