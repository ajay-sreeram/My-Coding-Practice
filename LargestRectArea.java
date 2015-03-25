import java.util.*;
public class LargestRectArea {
	public static void main(String args[]){
		System.out.println(largestRectangleArea(new int[][] {{0, 1, 1, 0, 1}, 
                   {1, 1, 0, 1, 0}, 
                   {0, 1, 1, 1, 0},
                   {1, 1, 1, 1, 0},
                   {1, 1, 1, 1, 1},
                   {0, 0, 0, 0, 0}}));
	}
    public static int largestRectangleArea(int[][] matrix) {
		for(int i=0;i<matrix.length;i++){
		for(int j=0;j<matrix[0].length;j++)
		System.out.print(matrix[i][j]+" ");
		System.out.println();
	}
	if(matrix.length==0) return 0;
    int m = matrix.length;
    int n = matrix[0].length;
    int left[]=new int[n], right[]=new int[n], height[]=new int[n];
    Arrays.fill(left,0);
	Arrays.fill(right,n);
	Arrays.fill(height,0);
	int maxA = 0;
    for(int i=0; i<m; i++) {
        int cur_left=0, cur_right=n; 
        for(int j=0; j<n; j++) {
            if(matrix[i][j]==1) height[j]++; 
            else height[j]=0;
            if(matrix[i][j]==1) left[j]=Math.max(left[j],cur_left);
            else {left[j]=0; cur_left=j+1;}
        }
        for(int j=n-1; j>=0; j--) {
            if(matrix[i][j]==1) right[j]=Math.min(right[j],cur_right);
            else {right[j]=n; cur_right=j;}    
        }
        
		for(int j=0; j<n; j++)
            maxA = Math.max(maxA,(right[j]-left[j])*height[j]);
		
		/* System.out.print("LEFT:");
		for(int k=0;k<n;k++)
			System.out.print(left[k]+" ");
		System.out.print("RIGHT:");
		for(int k=0;k<n;k++)
			System.out.print(right[k]+" ");
		System.out.print("HEIGHT");
		for(int k=0;k<n;k++)
			System.out.print(height[k]+" ");
		System.out.println(); */
	}
    return maxA;
}
}