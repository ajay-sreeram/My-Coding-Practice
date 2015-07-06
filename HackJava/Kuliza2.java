import java.io.*;
public class Kuliza2 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int t=Integer.parseInt(br.readLine());
		for(int k=0;k<t;k++){
			int n=Integer.parseInt(br.readLine());
			String tarr[]=br.readLine().split(" ");
			int arr[]=new int[1001];
			for(int j=0;j<tarr.length;j++){
				arr[Integer.parseInt(tarr[j])]=1;
			}
			int cnt=0;
			for(int i=1;i<1000;i++){
				if(arr[i]==1){
					if(arr[i-1]!=1&&arr[i+1]!=1)
					{
						cnt++;
						arr[i]=0;
					}
				}
			}
			
			for(int i=1;i<1000;i++){
				if(arr[i]==1){
					cnt++;
					arr[i]=0;
					arr[i-1]=0;
					arr[i+1]=0;
				}
			}
			if(arr[1000]==1)
				cnt++;
			System.out.println(cnt);
		}
	}
}
