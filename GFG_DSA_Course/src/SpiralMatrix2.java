import java.util.*;

class SpiralMatrix2 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        //spiralMatrix(arr);
         int[][] arr1={{1,2,3,33},
                    {4,5,6,66},
                    {7,8,9,99}};
        spiralMatrix(arr1);
    }
    
    static void spiralMatrix(int[][] arr){
        
        
        int row=arr.length-1;
        int col=arr[0].length-1;

        int left=0;
        int right=col;
        int top=0;
        int bottom=row;
    
        //System.out.println(row+" "+col+" "+left+" "+right+" "+top+" "+ bottom);

        while(row>0){
           // System.out.println("inside priniting loop");

            for(int i=left;i<=right;i++)
                System.out.print(arr[top][i]+"  ");
            top++;
            System.out.println();

            for(int i=top;i<=bottom;i++)
                System.out.print(arr[i][right]+" ");
            right--;
            System.out.println();

            for(int i=right;i>=left;i--)
                System.out.print(arr[bottom][i]+" ");
            bottom--;
            System.out.println();

            for(int i=bottom;i>=top;i--)
                System.out.print(arr[i][left]+" ");
            left++;
            System.out.println();

            row++;


        }


        
    }
}


// Given an MxN matrix, print the elements in a spiral manner
// Input: matrix = [[1,2,3],
//                 [4,5,6],
//                 [7,8,9]]
                    
// Output: [1,2,3,6,9,8,7,4,5]
// Note: The matrix can be a non-square matrix