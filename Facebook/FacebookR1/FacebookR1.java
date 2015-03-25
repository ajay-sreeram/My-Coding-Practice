import java.io.*;
import java.util.*;
public class FacebookR1 {
    static int maxlen;
	public static void main (String[] args) throws IOException {
		BufferedReader buffer=new BufferedReader(new FileReader("input.in"));
		PrintWriter out=new PrintWriter("output.out");
		int n=Integer.parseInt(buffer.readLine());
		for(int c=1;c<=n;c++){
			String arr[]=buffer.readLine().trim().split(" ");
			int i,a,b,k,cnt=0;
			a=Integer.parseInt(arr[0]);
			b=Integer.parseInt(arr[1]);
			k=Integer.parseInt(arr[2]);
			for(i=a;i<=b;i++)
				if(pfact(i,k)==k)
					cnt++;
		out.println("Case #"+c+": "+cnt);
		}
		out.close();
	}
	public static int pfact(int n,int k){
		List<Integer> list=new ArrayList<Integer>();
		if(n%2==0)
			list.add(2);
		while (n%2 == 0){
			n = n/2;
		}
		for (int i = 3; i <= Math.sqrt(n); i = i+2){
			if(n%i==0)
				if(!list.contains(i))
					list.add(i);
			if(list.size()>k)
				return list.size();
			while (n%i == 0){
				n = n/i;
			}
		} 
		if (n > 2)
			if(!list.contains(n))
					list.add(n);
		return list.size();
	}
}
