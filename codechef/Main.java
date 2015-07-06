import java.io.*;
//import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int t=Integer.parseInt(br.readLine());
		for(int c=0;c<t;c++){
			int n=Integer.parseInt(br.readLine());
			String tarr[]=br.readLine().split(" ");
			int arr[]=new int[tarr.length];
			int i,j,sum=0;
			for(i=0;i<n;i++){
				int tmp=Integer.parseInt(tarr[i]);
				arr[i]=tmp;
				if(tmp>=n||tmp<0)
					break;
				sum+=tmp;
				if(sum>n)
					break;
			}
			if(sum>n||i!=n){
				System.out.println("-1");
				continue;
			}
			for(i=2;i<=sum;i++)
				System.out.print(i+" ");
			System.out.println("1");
			/* boolean check[]=new boolean[n+1];
			int res[]=new int[n];
			int cnt=0;
			i=0;
			int max=n*n;
			int k=1;
			//System.out.println(Arrays.toString(arr));
			for(i=0;i<n;i++){
				if(arr[i]>0){
					while(true){
						if(cnt>=n)
							break;
						cnt++;
						if(k>n)
							k=1;
						if(check[k]==false&&k!=i+1){
							res[i]=k;
							check[k]=true;
							cnt++;
							break;
						}
						k++;
					}
				}
				}
			if(cnt>=n)
				System.out.println("-1waste");
			else
				for(i=0;i<n;i++)
					System.out.print(res[i]+" "); */
			
		}
	}
}
