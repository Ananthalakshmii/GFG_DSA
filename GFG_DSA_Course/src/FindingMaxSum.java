
public class FindingMaxSum {
	public static void main(String[] args) {
		int[] arr= {4,5,2,-1,34,5};
		int maxSum=maxSum(arr,arr.length);
		System.out.println(maxSum);
	}

	private static int maxSum(int[] arr, int length) {
		int sum=0;
		int max=0;
		for(int i=0;i<length;i++) {
			sum=sum+arr[i];
			max=Math.max(max, sum);
		}
		return max;
	}

}
