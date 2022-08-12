package com.accolite.recursion;

// for a string of length n, there will n! permutation

public class Permutation {
	public static void main(String[] args) {
		String str="abc";
		int index=0;
		permute(str,index);
	}

	private static void permute(String str,int index) { // fixing index position and reaching out to others
		if(index==str.length()-1) {
			System.out.println(str);
			return;
		}
		for(int j=index;j<str.length();j++) {
			str=swap(str,index,j);
			permute(str,index+1);
			str=swap(str,index,j); // swapping back to return the original string to the caller
		}
		
	}

	private static String swap(String str, int index, int j) {
		char temp;
		char[] charArray=str.toCharArray();
		temp=charArray[index];
		charArray[index]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}

	

}
