import java.io.*;
//import java.util.*;

class Pair{
	int min;
	int max;
	Pair(int mi,int ma){
		min=mi;
		max=ma;
	}
}
public class GeekMinMax{
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
			Pair res=rec(arr,0,arr.length);
			System.out.println("MIN:"+res.min+" MAX:"+res.max);
		}
	}
	public static Pair rec(int arr[],int low,int high){
		int min,max;
		if(low==high)
		{
			max=low;
			min=low;
			return new Pair(min,max);
		}
		else if(high==low+1){
			if(arr[low]<arr[high]){
				min=arr[low];
				max=arr[high];
			}
			else{
				max=arr[low];
				min=arr[high];
			}
			return new Pair(min,max);
		}
		else{
			int mid=(low+high)/2;
			Pair t1=rec(arr,low,mid);
			Pair t2=rec(arr,mid+1,high);
			Pair nRes=new Pair(0,0);
			if(t1.min<t2.min)
				nRes.min=t1.min;
			else
				nRes.min=t2.min;
			
			if(t1.max>t2.max)
				nRes.max=t1.max;
			else
				nRes.max=t2.max;
			return nRes;
		}
	}
}
