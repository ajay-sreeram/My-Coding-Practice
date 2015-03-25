import java.io.*;
import java.util.*;
public class Try2 {
    static int max;
	public static void main (String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line=buffer.readLine();
		String tarr[]=line.split(" ");
		int i;
		int len=tarr.length;
		int arr[]=new int[len];
		int sortarr[]=new int[len];
		for(i=0;i<len;i++){
			arr[i]=Integer.parseInt(tarr[i]);
			sortarr[i]=arr[i];
		}
		Arrays.sort(sortarr);
		int pos=getPosition(sortarr,arr);
		System.out.println("POS:"+pos);
	}
	public static int getPosition(int sort[],int arr[]){
		int i,j,pos=0;
		int len=sort.length;
		int tmplen=len-1;
		boolean flag[]=new boolean[len];
		for(i=0;i<len;i++){
			int tmp=arr[i];
			for(j=0;j<len;j++)
				if(flag[j]==false)
					if(sort[j]!=tmp)
						pos+=fact(tmplen);
					else{
						tmplen--;
						flag[j]=true;
						break;
					}
		}
		return pos;
	}
	public static int fact(int n){
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
}