import java.io.*;
import java.util.*;
public class HashSets {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int c,i,j;
		HashSet<String> hs=new <String>HashSet();
		for(c=0;c<n;c++){
			String tarr[]=br.readLine().split(" ");
			String st;
			if(tarr[0].compareTo(tarr[1])>0){
				st=tarr[0]+" "+tarr[1];
			}else{
				st=tarr[1]+" "+tarr[0];
			}
			hs.add(st);
			System.out.println(hs.size());
		}
	}
}
