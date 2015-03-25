import java.io.*;
public class GeeksBrokingEggs{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			String arr[]=line.split(" ");
			int n=Integer.parseInt(arr[0]);
			int k=Integer.parseInt(arr[1]);
			System.out.println(minFloors(n,k));
		}
	}
	public static int minFloors(int n,int k){
		if(k==0||k==1)
			return k;
		if(n==1)
			return k;
		int min=Integer.MAX_VALUE,res;
		for(int i=1;i<=k;i++){
			res=max(minFloors(n-1,i-1),minFloors(n,k-i));
			if(res<min)
				min=res;
		}
		return min+1;
	}
	public static int max(int a,int b){
		return a>b?a:b;
	}
}