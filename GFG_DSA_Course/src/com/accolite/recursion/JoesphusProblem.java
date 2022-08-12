package com.accolite.recursion;

/*
 there are n persons to be arranged in a circle ranging from 0 to n-1.
 and given k, the kth person should be killed from current position(as 1).
 and return the survivor index position
 */
public class JoesphusProblem {
	public static void main(String[] args) {
		int n=5,k=3;
		int survivor=josephus(n,k);
		System.out.println(survivor);
		
		//if josephus starts with index 1, then increment the printing result with 1
		System.out.println(survivor+1);
		
	}

	private static int josephus(int n, int k) {
		if(n==1)
			return 0;
		return (josephus(n-1, k)+k)%n; // for every recursive call, new circle will be created
		/*
		 find the relation bwn the existing circle and the new circle generated afer killing kth person.
		 in general,after killing, pistol will be with the next index postion-> but in the recusive call, it will be in pos 0.
		 ->k+1 === 0
		 and if k+i reaches greater than n, mod should be taken
		 so comes the expression
		 jos(n-1,k) and adding with k and mod with n
		 */
	}

}

//theta(n) ... <- T(n)=T(n-1)+C