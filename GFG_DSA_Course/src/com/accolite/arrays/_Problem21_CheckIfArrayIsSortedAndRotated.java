package com.accolite.arrays;

public class _Problem21_CheckIfArrayIsSortedAndRotated {
	public static void main(String[] args) {
		int n=4;
		int arr[]= {3,4,1,2};
		boolean result=checkRotatedAndSorted(arr,n);
		System.out.println(result);
		int[] arr1= {1,2,3};
		int arr2[]= {3,2,1};
		System.out.println(checkRotatedAndSorted(arr1, 3));
		System.out.println(checkRotatedAndSorted(arr2, 3));
		int[] arr3= {10,20,30,14};
		System.out.println(checkRotatedAndSorted(arr3, 4));
		int[] arr4= {30,20,10,50,35};
		System.out.println(checkRotatedAndSorted(arr4, 5));
		int[] arr5= {30,20,10,50,40,35};
		System.out.println(checkRotatedAndSorted(arr5, 6));
		int[] arr6= {10,20,30,7,8,9};
		System.out.println(checkRotatedAndSorted(arr6, 6));
	}

	private static boolean checkRotatedAndSorted(int[] arr, int n) {
		int inccount=0;
		int deccount=0;
		for(int i=0;i<n-1;i++) {
			if(deccount==0 && arr[i]<arr[i+1])
				inccount++;
			else if(deccount==1 && arr[i]<arr[i+1]) {
				//System.out.println(arr[i+1]);
				if(arr[i+1]>arr[0]) {
					//System.out.println("returning here");
					return false;
				}
				else {
					
					inccount++;
					//System.out.println("inc count"+inccount);
				}
			}
			else if(arr[i+1]<arr[0])
				deccount++;
		}
		//System.out.println("loop1 "+inccount+" "+deccount);
		if(inccount==n-1)
			return false;
		else if(deccount==1)
			return true;
		
		inccount=0;
		deccount=0;
		
		for(int i=0;i<n-1;i++) {
			if(deccount==0 && arr[i]>arr[i+1])
				inccount++;
			else if(deccount==1 && arr[i]>arr[i+1]) {
				if(arr[i+1]<arr[0]) {
					//System.out.println("returning here");
					return false;
				}
				else {
					
					inccount++;
					//System.out.println("inc count"+inccount);
				}
			}
			else if(arr[i+1]>arr[0])
				deccount++;
			
		}
		//System.out.println("loop1 "+inccount+" "+deccount);
		if(inccount==n-1)
			return false;
		else if(deccount==1)
			return true;
		
		return false;
	}

}
