import java.io.*;
import java.util.*;
public class Strings {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String word=br.readLine();
		int l=Integer.parseInt(br.readLine());
		int i,j,k;
		String arr[]=new String[word.length()-l+1];
		for(i=0,j=l;j<=word.length();i++,j++){
			arr[i]=word.substring(i,j);
			//System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
	}
}
