import java.io.*;
import java.util.*;
import java.math.*;


public class Solutions3{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int i,j,a,b,t=Integer.parseInt(in.nextLine());
		String st;
		String temp[];
		for(j=0;j<t;j++)
		{
		temp=in.nextLine().split(" ");
		a=Integer.parseInt(temp[0]);
		b=Integer.parseInt(temp[1]);
		int cnt=0;
		for(i=a;i<=b;i++)
		{
		st=Integer.toBinaryString(i);
		//System.out.println(st.length());
		cnt+=st.length()-st.replace("1","").length();
		}
		System.out.println(cnt);
		}
	}
}