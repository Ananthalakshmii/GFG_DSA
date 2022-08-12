package com.accolite.recursion;

// for a string of length n, then there will be 2^n subsets

public class GenerateSubsets {
	public static void main(String[] args) {
		String str="abc";
		String current="";
		int index=0;
		generateSubsets(str,current,index);
	}

	private static void generateSubsets(String str,String current,int index) { //from initial empty string, including/excluding next char
		if(index==str.length()) {
			System.out.println(current);
			return;
		}
		generateSubsets(str, current, index+1);// without including particular index char
		generateSubsets(str, current+str.charAt(index), index+1); //including index char
		
	}

}
