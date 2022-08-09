package com.accolite.bitmagic;
// given a string, there will be 2^n subsets..
// similar to permutation and anagram i think
public class PowerSetUsingBitwiseOperator {
	
	public static void main(String[] args) {
		String s="abc";
		printPowerSets(s);
	}

	/*range will be from 0 to 2^n -1
	 counter - 0 to 7 , j=0,1,2
	 checking which bit is set to 1 and printing the corresponding
	 string from backward
	 */
	private static void printPowerSets(String s) {
		int n=s.length();
		int powerSize=(int) Math.pow(2, n);
		for(int counter=0;counter<powerSize;counter++) {
			for(int i=0;i<n;i++) {
				if((counter & (1<<i))!=0)
					System.out.print(s.charAt(i));
			}
			System.out.println();
		}
		
	}

}


//theta(2^n * n)