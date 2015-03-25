import java.io.*;
//import java.util.*;
public class GeekMinNumOfJumps{
	public static int jumpArr[];
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			String tarr[]=line.split(" ");
			int arr[]=new int[tarr.length];
			int i;
			for(i=0;i<arr.length;i++){
				arr[i]=Integer.parseInt(tarr[i]);
			}
			jumpArr=new int[arr.length];
			System.out.println(minNumOfJumps(arr,0,arr.length-1));
		}
	}
	public static int minNumOfJumps(int arr[],int l,int h){
		if(l==h)
			return 0;
		if(arr[l]==0)
			return Integer.MAX_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=l+1;i<=h&&i<=arr[l]+l;i++){
			if(jumpArr[i]==0){
			int jumps=minNumOfJumps(arr,i,h);
			if(jumps!=Integer.MAX_VALUE&&jumps+1<min)
				min=jumps+1;
			}
			else{
				if(jumpArr[i]!=Integer.MAX_VALUE&&jumpArr[i]+1<min)
				min=jumpArr[i]+1;			
			}
		}
		return min;
	}
}