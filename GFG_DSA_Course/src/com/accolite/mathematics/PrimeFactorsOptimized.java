package com.accolite.mathematics;

public class PrimeFactorsOptimized {

	public static void main(String[] args) {
		int num=12;
		primeFactorsOptimized(num);
		System.out.println();
		primeFactorsOptimized(450);
		System.out.println();
		primeFactorsOptimized(84); //7*7>7 -> so after for loop explicitly printing num
	}

	private static void primeFactorsOptimized(int num) {
		if(num<=1)
			return;
		while(num%2==0) {
			System.out.print(2+" ");
			num=num/2;
		}
		while(num%3==0) {
			System.out.print(3+" ");
			num=num/3;
		}
		for(int i=5;i*i<=num;i=i+6) {
			while(num%i==0) {
				System.out.print(i+" ");
				num=num/i;
			}
			while(num%(i+2)==0) {
				System.out.print(i+2);
				num=num/(i+2);
			}
		}
		
		if(num>3)
			System.out.print(num);
		
	}
	
}

//theta(sqrt(n))