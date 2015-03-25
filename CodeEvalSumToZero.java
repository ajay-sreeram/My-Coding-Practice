import java.io.*;
import java.util.*;
public class CodeEvalSumToZero{
	public static int cnt=0;
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null&&line.trim().length()!=0){
			String tarr[]=line.split(",");
			cnt=0;
			int arr[]=new int[tarr.length];
			int i;
			for(i=0;i<arr.length;i++)
				arr[i]=Integer.parseInt(tarr[i]);
			fun(arr,new ArrayList<Integer>(),0,0);
			System.out.println(cnt);
		}
	}
	public static void fun(int arr[],List<Integer> list,int sum,int pos){
		if(list.size()==4){
			if(sum==0)
				cnt++;
			return;
		}
		for(int i=pos;i<arr.length;i++)
			if(!list.contains(i)){
				sum=sum+arr[i];
				list.add(i);
				fun(arr,list,sum,i+1);
				list.remove(new Integer(i));
				sum-=arr[i];
			}
	}
}