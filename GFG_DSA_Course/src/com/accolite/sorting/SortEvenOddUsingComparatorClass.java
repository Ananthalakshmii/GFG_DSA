package com.accolite.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortEvenOddUsingComparatorClass { //[10, 20, 12, 5, 3]
 public static void main(String[] args) {
	Integer arr[]= {5,10,20,3,12};
	Arrays.sort(arr,new customClass());
	System.out.println(Arrays.toString(arr));
}
}

class customClass implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1%2-o2%2; //checked with the remainder-- if o1%2 is 0 then that is preferred else if o2%2 is zero, this is preferred, if both are 0, stability is maintained
	}
	
}