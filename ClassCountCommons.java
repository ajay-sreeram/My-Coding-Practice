import java.io.*;
import java.util.*;
public class ClassCountCommons{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String tarr1[]=br.readLine().split(" ");
		String tarr2[]=br.readLine().split(" ");
		int arr1[]=new int[tarr1.length];
		int arr2[]=new int[tarr2.length];
		int i,j;
		for(i=0;i<tarr1.length;i++){
			arr1[i]=Integer.parseInt(tarr1[i]);
			arr2[i]=Integer.parseInt(tarr2[i]);
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int cnt=0;
		for(i=0,j=0;i<arr1.length&&j<arr2.length;){
			if(arr1[i]==arr2[j]){
				i++;
				j++;
				cnt++;
			}
			else if(arr1[i]<arr2[j])
					i++;
			else
				j++;
		}
		System.out.println(cnt);
	}
}