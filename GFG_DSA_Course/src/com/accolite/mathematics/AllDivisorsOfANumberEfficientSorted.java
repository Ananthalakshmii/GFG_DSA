package com.accolite.mathematics;


//Divisor always occur in pair
	// 30 = (1*30) , (2*15), (3*10), (5*6)
	//x*y=n
	//if x<y, then x*x <n -> x <sqrt(n)

//can find atleast one number in a pair  if we take sqrt(num)

//OUTPUT IS SORTED

public class AllDivisorsOfANumberEfficientSorted {
	public static void main(String[] args) {
		int num=6;
		allDivisorsOfANumberSortedAndEfficient(num);
		System.out.println();
		allDivisorsOfANumberSortedAndEfficient(25);
		System.out.println();
		allDivisorsOfANumberSortedAndEfficient(15);
	}

	private static void allDivisorsOfANumberSortedAndEfficient(int num) {
		int i;
		for(i=1;i*i<=num;i++) {
			if(num%i==0) 
				System.out.print(i+" ");
		}
		for(;i>=1;i--) {
			if(num%i==0)
				System.out.print(num/i+" ");
		}
		
	}

}

//theta(sqrt(n))
//auxiliary space: theta(1)
