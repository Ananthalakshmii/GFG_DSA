package com.accolite.arrays;

public class Deletion {
	public static void main(String[] args) {
		int[] arr= {3,8,12,5,6};
		int search=12;
		int size=delete(arr,search);
		System.out.println(size);
	}

	private static int delete(int[] arr,int search) {
		int i;
		for(i=0;i<arr.length;i++)
			if(arr[i]==search)
				break;
		
		if(i==arr.length)
			return arr.length;
		
		for(int j=i;j<arr.length-1;j++)
			arr[j]=arr[j+1];
		
		return arr.length-1;
	}

}

//theta(n)


