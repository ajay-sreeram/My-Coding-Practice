import java.io.*;
public class Sudoko{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 int grid[][]=new int[9][9];
		for(int i=0;i<9;i++){
			grid[i]=new int[9];
			String arr[]=br.readLine().split(" ");
			for(int j=0;j<9;j++){
				grid[i][j]=Integer.parseInt(arr[j]);
			}
		} 
		/* int grid[][]={{0,0,7,0,5,0,0,1,4},
    		 {0,0,0,3,0,2,7,0,0},
    		 {0,3,0,4,8,0,0,0,5},
    		 {0,0,0,9,0,0,2,0,3},
    		 {3,0,4,2,6,8,1,0,9},
    		 {2,0,1,0,0,4,0,0,0},
    		 {5,0,0,0,4,3,0,7,0},
    		 {0,0,8,1,0,6,0,0,0},
    		 {9,1,0,0,2,0,4,0,0}
    		 }; */
		fillsudoko(grid,0,0);	
	}
public static void fillsudoko(int grid[][],int r,int c){
	if(r==9){
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		return;
	}
	if(grid[r][c]==0){
		for(int d=1;d<=9;d++){
			if(valid(grid,r,c,d)){
				grid[r][c]=d;
				if(c==8)
					fillsudoko(grid,r+1,0);
				else
					fillsudoko(grid,r,c+1);
			}
		}
		grid[r][c]=0;
	} else{
		if(c==8)
			r=r+1;
		c=(c+1)%9;
		fillsudoko(grid,r,c);
	} 
}
public static boolean valid(int grid[][],int r,int c,int val){
	for(int i=0;i<9;i++){
		if(grid[r][i]==val||grid[i][c]==val){
			return false;
		}
	}
	int sr=(r/3)*3;
	int sc=(c/3)*3;
	for(int i=sr;i<sr+3;i++)
		for(int j=sc;j<sc+3;j++)
			if(grid[i][j]==val)
				return false;
	return true;
}
}