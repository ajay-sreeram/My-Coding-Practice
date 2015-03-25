import java.io.*;
import java.util.*;
public class ClassNumOfZeros{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			String tarr[]=line.split(" ");
			int i;
			int arr[]=new int[tarr.length];
			for(i=0;i<arr.length;i++){
				arr[i]=Integer.parseInt(tarr[i]);
			}
			int l,r,m;
			l=0;
			r=arr.length-1;
			while(l+1<r){
				m=l+(r-l)/2;
				if(arr[m]==0)
					l=m;
				else
					r=m-1;
			}
			System.out.println(r);
		}
	}
}