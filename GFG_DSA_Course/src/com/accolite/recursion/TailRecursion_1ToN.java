package com.accolite.recursion;

/*
 It is called tail recursive when the recursive call happens at the last.
 Its execution time is faster
 caller need not save the state.
 optimization that modern compiler does -> for fun(n-1) as -> n=n-1; goto start; and adding the label for the base case
 --reduces aux space
 -is called tail call elimination
 eg: printing N to 1- is called tail recursion, inorder and preorder- tail recursive
 
 eg: printing 1 to N is not tail recursive and it is not optimized , post order not tail recursive
 
 every non tail recursive CANNOT be converted into tail recursive
 */
public class TailRecursion_1ToN {
	public static void main(String[] args) {
		int n=5;
		int temp=0;
		print1ToNTailRecursion(n,temp);
	}

	private static void print1ToNTailRecursion(int n, int temp) {
		if(n==temp)
			return;
		System.out.println(temp+1);
		print1ToNTailRecursion(n, temp+1);
		
	}

}
