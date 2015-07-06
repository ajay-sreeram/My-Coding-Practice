import java.io.*;
import java.util.*;
public class Pascal {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		int prev=1;
		for(int i=0;i<n;i++){
			int t=prev*(n-i)/(i+1);
			list.add(t);
			prev=t;
			System.out.println(t);
		}
		System.out.println(list);
	}
}
