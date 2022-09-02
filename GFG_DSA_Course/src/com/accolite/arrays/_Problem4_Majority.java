package com.accolite.arrays;

public class _Problem4_Majority {
	public static void main(String[] args) {
		int n = 11;
		int	arr[] = {1,1,2,2,3,3,4,4,4,4,5};
		int x = 4, y = 5;
		int element=majorityWins(arr,n,x,y);
		System.out.println(element);
	}

	private static int majorityWins(int[] arr, int n, int x, int y) {
			
			int countx=0, county=0;
			for(int i=0;i<n;i++) {
				if(arr[i]==x)
					countx++;
				if(arr[i]==y)
					county++;
			}
			
			if(countx==county)
				return Math.min(x, y);
			else if(countx>county)
				return x;
			else
				return y;
			
	}

}
