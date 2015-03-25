public class MinPathSum {
	public static void main(String args[]){
		int arr[][]={{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(minPathSum(arr));
	}
    public static int minPathSum(int[][] grid) {
        int arr[][]=new int[grid.length][grid[0].length];
        arr[0][0]=grid[0][0];
        int j=0,i,sum=arr[0][0];
        for(i=1;i<grid[0].length;i++){
            sum=sum+grid[0][i];
            arr[0][i]=sum;
        }
        sum=grid[0][0];
        for(i=1;i<grid.length;i++){
            sum=sum+grid[i][0];
            arr[i][0]=sum;
        }
        for(i=1;i<grid.length;i++){
            for(j=1;j<grid[0].length;j++){
                arr[i][j]=grid[i][j]+Math.max(arr[i][j-1],arr[i-1][j]);
            }
        }
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr[0].length;j++){
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
        return arr[grid.length-1][grid[0].length-1];
    }
}