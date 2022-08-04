package com.accolite.mathematics;


//Divisor always occur in pair
	// 30 = (1*30) , (2*15), (3*10), (5*6)
	//x*y=n
	//if x<y, then x*x <n -> x <sqrt(n)

//can find atleast one number in a pair  if we take sqrt(num)

//OUTPUT IS NOT SORTED

public class AllDivisorsOfANumberEfficientUnSorted {
	public static void main(String[] args) {
		int num=6;
		allDivisorsOfANumberUnsortedAndEfficient(num);
		System.out.println();
		allDivisorsOfANumberUnsortedAndEfficient(25);
		System.out.println();
		allDivisorsOfANumberUnsortedAndEfficient(15);
	}

	private static void allDivisorsOfANumberUnsortedAndEfficient(int num) {
		for(int i=1;i*i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				if(i!=num/i) // to check for perfect squares like 25=5*5
				System.out.print(num/i+" ");
			}
		}
		
	}

}
