package com.accolite.searching;

public class SquareRoot {
	public static void main(String[] args) {
	int x=10;
	int sqrt=squareRoot(x);
	System.out.println(sqrt);
	}

	private static int squareRoot(int x) {
		int low=1;
		int high=x;
		int sqrt=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			int sq=mid*mid;
			if(sq==x)
				return mid;
			else if(sq<x) {
				low=mid+1;
				sqrt=mid; //storing the floor value to return
			}else
				high=mid-1;
				
		}
		return sqrt;
	}

}

//theta(logn)