import java.io.*;
public class Sherlock31 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String tarr[]=br.readLine().trim().split(" ");
		int n=Integer.parseInt(tarr[0]);
		int q=Integer.parseInt(tarr[1]);
		int arr[]=new int[n+1];
		int i,j,cnt,k;
		tarr=br.readLine().trim().split(" ");
		for(i=1;i<=n;i++)
			arr[i]=Integer.parseInt(tarr[i-1]);
		int grid[][]=new int[n+1][];
		for(i=1;i<=n;i++){
			grid[i]=new int[n+1];
			for(j=i+1;j<=n;j++)
				if(arr[i]>arr[j])
					grid[i][j]=grid[i][j-1]+1;
		}
		
		for(k=0;k<q;k++){
			cnt=0;
			tarr=br.readLine().split(" ");
			int s=Integer.parseInt(tarr[0]);
			int e=Integer.parseInt(tarr[1]);
			for(i=s;i<=e;i++)
				cnt+=grid[i][e];
			System.out.println(cnt);
		}
	}
}
