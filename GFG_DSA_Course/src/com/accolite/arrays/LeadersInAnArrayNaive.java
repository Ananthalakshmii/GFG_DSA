package com.accolite.arrays;


// an element is called leader if there is no element greater than it right to it.
//even if the values are equal right to it, it is not considered leader
public class LeadersInAnArrayNaive {

	public static void main(String[] args) { 
		int[] arr= {7,10,4,3,6,5,2};
		printLeaders(arr);
	}

	private static void printLeaders(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean flag=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>=arr[i]) {
					flag=false;
					break;
				}
			}
			if(flag== true)
				System.out.print(arr[i]+" ");
		}
	}
}


//o(n^2)