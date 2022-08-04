package com.accolite.mathematics;

public class CountDigitsLogarithmic {

	public static int logCountDigits(int x) {
		return (int) Math.floor(Math.log10(x)+1);
	}
	public static void main(String[] args) {
		int num=789;
		int count=logCountDigits(num);
		System.out.println(count);
	}
}
