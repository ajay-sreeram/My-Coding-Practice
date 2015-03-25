import java.io.*;
import java.util.*;
public class Codenigma2 {
	public static int max;
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int tests=Integer.parseInt(br.readLine());
		for(int z=0;z<tests;z++){
			String tarr[]=br.readLine().split(" ");
			int c=Integer.parseInt(tarr[0]);
			int t=Integer.parseInt(tarr[1]);
			int grid[][]=new int[c+1][t+1];
			while(true){
				line=br.readLine().trim();
				if(line.length()==2)
					break;
				tarr=line.split(" ");
				grid[Integer.parseInt(tarr[0])][Integer.parseInt(tarr[1])]=1;
			}
			max=0;
			fun(grid,1,new HashSet<Integer>());
			System.out.println(max);
		}
	}
	public static void fun(int grid[][],int r,Set<Integer> list){
		if(max<list.size())
			max=list.size();
		if(r>=grid.length)
			return;
		for(int i=1;i<grid[r].length;i++){
			if(grid[r][i]==1&&(!list.contains(i))){
				list.add(i);
				fun(grid,r+1,list);
				list.remove(new Integer(i));
				//fun(grid,r+1,list);
			}
		}
	}
}
