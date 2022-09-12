
public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		spiralMatrix(arr);
		
	}

	private static void spiralMatrix(int[][] arr) {
		int row=arr.length-1;
		int col=arr[0].length-1;
		
		int left=0;
		int right=col;
		int top=0;
		int bottom=row;
		
		System.out.println(left+" "+right+" "+top+" "+bottom);
		while(row>0) {
		for(int i=left;i<=right;i++) {
			System.out.print(arr[top][i]+" ");
		}
		top++;
		System.out.println();
		for(int i=top;i<=bottom;i++) {
			System.out.print(arr[i][right]+" ");
		}
		right--;
		System.out.println();
		for(int i=right;i>=left;i--) {
			System.out.print(arr[bottom][i]+" ");
		}
		bottom--;
		System.out.println();
		for(int i=bottom;i>=top;i--) {
			System.out.print(arr[i][left]+" ");
		}
		left++;
		row--;
		}
	}

}
