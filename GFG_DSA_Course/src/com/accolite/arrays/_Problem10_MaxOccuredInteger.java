package com.accolite.arrays;

public class _Problem10_MaxOccuredInteger {
	public static void main(String[] args) {
		int[] left= {2,1,3};
		int[] right= {5,3,9};
		int max=maxOccured(left,right,left.length,9);
		System.out.println(max);
	}

	private static int maxOccured(int[] left, int[] right, int length, int maxx) {
		int[] arr=new int[maxx+2];
		for(int i=0;i<length;i++) {
			arr[left[i]]++;
			arr[++right[i]]--;
		}
		
		for(int i=1;i<maxx;i++)
			arr[i]=arr[i]+arr[i-1];
		
		int max=arr[0];
		int index=0;
		for(int i=1;i<maxx;i++) {
			if(arr[i]>max) {
				max=arr[i];
				index=i;
			}
		}
		return index;
	}

}
