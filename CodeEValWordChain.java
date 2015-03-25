import java.io.*;
//import java.util.*;
public class CodeEValWordChain {
    static int maxlen;
	public static void main (String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			String arr[]=line.split(",");
			int i,j,k;
			maxlen=1;
			for(i=0;i<arr.length;i++)
				rec(arr,arr[i].charAt(arr[i].length()-1),i,1);
			if(maxlen==1)
				System.out.println("None");
			else
				System.out.println(maxlen);
		}
	}
	public static void rec(String arr[],char ch,int pos,int len){			
		if(maxlen<len)
			maxlen=len;
		if(len==arr.length)
			return;
		for(int i=pos+1,cntr=0;cntr<arr.length-1;cntr++,i++){
			if(i==arr.length)
				i=0;
			if(arr[i].trim().charAt(0)==ch)
			{
				rec(arr,arr[i].charAt(arr[i].length()-1),i,len+1);
			}
		}
	}
}