package com.accolite.mathematics;

//Divisor always occur in pair
	// 30 = (1*30) , (2*15), (3*10), (5*6)
	//x*y=n
	//if x<y, then x*x <n -> x <sqrt(n)

//number can be written as multiplication of powers of prime factors
//450 = 2pow1 * 3 pow2* 5 pow2
public class PrimeFactorsEfficient {
	public static void main(String[] args) {
		int num=12;
		primeFactorsEfficient(num);
		System.out.println();
		primeFactorsEfficient(450);
		System.out.println();
		primeFactorsEfficient(84); //7*7>7 -> so after for loop explicitly printing num
	}

	private static void primeFactorsEfficient(int num) {
		for(int i=2;i*i<=num;i++) {
			while(num%i==0) {
				System.out.print(i+" ");
				num=num/i;
			}
		}
		if(num>1)
			System.out.print(num);
		
	}
}
