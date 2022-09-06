package com.accolite.searching;

/*
 minimize the max pages allocated
 only contigious pages can be allocated
 
 arr consists of no of pages in books
 and no of students
 student can read only contiguous books
 minimize the pages
 --max no of pages read by the student is minimum
 
 we need to choose k-1 cuts out of n-1 cuts shown: total ways:- (n-1)C(k-1)
 */
public class AllocateMinimumPagesNaive {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int noOfStudents=2;
		int minPages=allocateMinPages(arr,arr.length,noOfStudents);
		System.out.println(minPages);
	}

	private static int allocateMinPages(int[] arr,int size, int noOfStudents) {
		if(noOfStudents==1)
			return sum(arr,0,size-1);
		if(size==1)
			return arr[0];
		
		int result=Integer.MAX_VALUE;
		
		for(int i=1;i<size;i++) {
			result= Math.min(result, Math.max(allocateMinPages(arr,i, noOfStudents-1), sum(arr, i, size-1)));
		}
		
		return result;
	}

	private static int sum(int[] arr, int start, int end) {
		int sum=0;
		for(int i=start;i<=end;i++)
			sum=sum+arr[i];
		return sum;
	}

}

//exponential solution
//o(nk)---o(size*noofStudents)