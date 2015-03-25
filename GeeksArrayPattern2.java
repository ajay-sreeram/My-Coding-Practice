//import java.util.*;
import java.io.*;
public class GeeksArrayPattern2{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			int n=Integer.parseInt(line);
			int arr[]=new int[2*n];
			int i;
			if(rec(arr,n,n)){
				for(i=0;i<2*n;i++)
					System.out.print(arr[i]+" ");
			}
			else{
				System.out.print("NOTHING");
			}
			System.out.println();
		}
	}
	public static boolean rec(int arr[],int cur,int n){
		if(cur==0)
			return true;
		for(int i=0;i<n+cur-2;i++){
			if(arr[i]==0&&arr[i+(n-cur+1)+1]==0){
				arr[i]=cur;
				arr[i+n-cur+2]=cur;
				if(rec(arr,cur-1,n))
					return true;
				arr[i]=0;
				arr[i+n-cur+2]=0;
			}
		}
		return false;
	}
}