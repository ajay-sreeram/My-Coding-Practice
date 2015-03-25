import java.io.*;
import java.util.*;
public class ImageContract {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String tmp[]=br.readLine().split(" ");
		int r,c;
		r=Integer.parseInt(tmp[0]);
		c=Integer.parseInt(tmp[1]);
		int given[][],grid[][];
		given=new int[r][];
		grid=new int[r][];
		String line;
		r=0;
		while((line=br.readLine())!=null&&line.length()>1){
			String tarr[]=line.split(" ");
			given[r]=new int[c];
			grid[r]=new int[c];
			for(int i=0;i<c;i++)
				given[r][i]=Integer.parseInt(tarr[i]);
			r++;
		}
		int i,j;
		for(i=0;i<c;i++)
			grid[0][i]=given[0][i];
		for(i=1;i<r;i++)
			for(j=0;j<c;j++){
				int min=Integer.MAX_VALUE;
				if(j-1>=0)
					min=grid[i-1][j-1]<min?grid[i-1][j-1]:min;
				min=grid[i-1][j]<min?grid[i-1][j]:min;
				if(j+1<c)
					min=grid[i-1][j+1]<min?grid[i-1][j+1]:min;
				grid[i][j]=min+given[i][j];
			}
		int minc=0,min=Integer.MAX_VALUE;
		for(i=0;i<c;i++)
			if(grid[r-1][i]<min){
				minc=i;
				min=grid[r-1][i];
			}
		System.out.println("MIN:"+min);
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		int path[]=new int[r];
		findPath(min,r-1,minc,path,given,grid);
	}
	public static void findPath(int val,int r,int c,int []path,int given[][],int grid[][]){
		if(r==0){
			path[r]=c;
			System.out.println(Arrays.toString(path));
			for(int i=0;i<path.length;i++){
				for(int j=path[i];j<given[i].length-1;j++){
					given[i][j]=given[i][j+1];
				}
			}
			for(int i=0;i<path.length;i++)
				given[i][j]=0;
			return;
		}
		path[r]=c;
		val=val-given[r][c];
		r--;
		if(c-1>=0&&val==grid[r][c-1])
			findPath(val,r,c-1,path,given,grid);
		if(val==grid[r][c])
			findPath(val,r,c,path,given,grid);
		if(c+1<given[0].length&&val==grid[r][c+1])
			findPath(val,r,c+1,path,given,grid);
	}
}
