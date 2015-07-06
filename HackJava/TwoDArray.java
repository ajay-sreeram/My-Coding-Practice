import java.io.*;
public class TwoDArray {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int arr[][]=new int[6][];
		int i=0,j=0;
		for(i=0;i<6;i++){
			line=br.readLine();
			arr[i]=new int[6];
			String tarr[]=line.split(" ");
			for(j=0;j<6;j++)
				arr[i][j]=Integer.parseInt(tarr[j]);
		}
		int max=-1000;
		for(i=0;i<4;i++)
			for(j=0;j<4;j++){
				int tmp=hg(arr,i,j);
				if(tmp>max)
					max=tmp;
			}
		System.out.println(max);	
	}
	public static int hg(int arr[][],int p,int q){
		int sum=0;
		for(int i=q;i<q+3;i++)
				sum+=(arr[p][i]+arr[p+2][i]);
		sum+=arr[p+1][q+1];
		return sum;
	}
}
