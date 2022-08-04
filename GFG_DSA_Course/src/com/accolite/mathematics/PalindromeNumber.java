package com.accolite.mathematics;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=78987;
		boolean result=palindrome(num);
		System.out.println(result);
		System.out.println(palindrome(3));
		System.out.println(palindrome(367));
	}

	private static boolean palindrome(int num) {
		if(num/10==0) // to handle single digit
			return true;
		int rev=0;
		int copy=num;
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(copy==rev)
			return true;
		return false;
	}

}

//theta(d) ->d=num of digits