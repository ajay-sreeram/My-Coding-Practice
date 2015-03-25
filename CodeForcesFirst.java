import java.io.*;
import java.util.*;
import java.nio.ByteOrder;
import java.text.*;
public class CodeForcesFirst {
    static int max;
	public static void main (String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			String arr[]=line.split(" ");
			int p1=Integer.parseInt(arr[0]);
			int p2=Integer.parseInt(arr[1]);
			int t1=Integer.parseInt(arr[2]);
			int t2=Integer.parseInt(arr[3]);
			int m1=3*p1/10;
			int m2=p1-p1*t1/250;
			int m;
			if(m1>m2)
				m=m1;
			else
				m=m2;
			int v1=3*p2/10;
			int v2=p2-p2*t2/250;
			int v;
			if(v1>v2)
				v=v1;
			else
				v=v2;
			if(m==v)
				System.out.println("Tie");
			else if(m>v)
				System.out.println("Misha");
			else
				System.out.println("Vasya");
		}
	}
}