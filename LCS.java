import java.io.*;
public class LCS {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st1=br.readLine();
		String st2=br.readLine();
		int m=st1.length();
		int n=st2.length();
		int i,j;
		int grid[][]=new int[m+1][n+1];
		for(i=m-1;i>=0;i--){
			for(j=n-1;j>=0;j--){
				grid[i][j]=grid[i+1][j+1];
				if(st1.charAt(i)==st2.charAt(j))
					grid[i][j]++;
				else{
					grid[i][j]=max(grid[i+1][j],grid[i][j+1]);
				}
			}
		}
		System.out.println(grid[0][0]);
	}
	public static int max(int x,int y){
		return x>y?x:y;
	}
}
