import java.io.*;
import java.util.*;
public class CodeEvalDataRecovary {
    public static void main (String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		while((line=buffer.readLine())!=null){
			String given[]=line.split(";");
			String tmp[]=given[1].split(" ");
			int num[]=new int[tmp.length+1];
			int check[]=new int[num.length];
			int i,j,n;
			for(i=0;i<tmp.length;i++){
				n=Integer.parseInt(tmp[i])-1;
				num[i]=n;
				check[n]=1;
			}
			for(i=0;i<check.length;i++){
				if(check[i]==0)
				{
					num[num.length-1]=i;
				}
				check[i]=i;
			}
			sort(num,check);
			String res[]=given[0].split(" ");
			for(i=0;i<check.length;i++)
				System.out.print(res[check[i]]+" ");
			System.out.println();
		}
	}
	public static void sort(int arr[],int tarr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]>arr[j]){
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
					t=tarr[i];
					tarr[i]=tarr[j];
					tarr[j]=t;
				}
		}
	
	}
}