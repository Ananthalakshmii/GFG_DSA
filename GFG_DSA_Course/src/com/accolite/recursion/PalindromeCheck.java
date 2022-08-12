package com.accolite.recursion;

public class PalindromeCheck {
	public static void main(String[] args) {
		String str="abbcbba";
		boolean result=isPalindrome(str,0,str.length()-1);
		System.out.println(result);
	}

	private static boolean isPalindrome(String str,int start,int end) {
		if(start>=end)//ood length string -> start=end; if even -> start> end in one og the recursive call
			return true;
		return (str.charAt(start)==str.charAt(end)) && (isPalindrome(str, start+1, end-1));
	}

}

//O(n)
//T(n)=T(n-2)+theta(1)
//aux space=O(n) ---n/2