package com.accolite.arrays;

import java.util.ArrayList;
import java.util.List;

public class _Problem32_PrintPattern {
	public static void main(String[] args) {
		int N=10;
		List<Integer> result=pattern(N);
		System.out.println(result);
		System.out.println(pattern(16));
	}

	private static List<Integer> pattern(int n) {
		List<Integer> list=new ArrayList<>();
		int original=n;
		pattern(n,list,original);
		return list;
	}

	private static void pattern(int n, List<Integer> list,int original) {
		list.add(n);
		if(n>0)
			pattern(n-5, list,original);
		if(n>0)
			list.add(n);
		
		
	}

}
