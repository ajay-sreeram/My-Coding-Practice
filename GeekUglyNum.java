import java.io.*;
import java.util.*;
public class GeekUglyNum{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			int n=Integer.parseInt(line.trim());
			System.out.println(n+"th ugly number:"+ugly(n));
		}
	}
	public static int ugly(int n){
		int uglynum[]=new int[n];
		int i2,i3,i5;
		i2=i3=i5=0;
		int next_2,next_3,next_5;
		Arrays.fill(uglynum,1);
		next_2=uglynum[i2]*2;
		next_3=uglynum[i3]*3;
		next_5=uglynum[i5]*5;
		int num=1;
		for(int i=1;i<n;i++){
			num=min(next_2,next_3,next_5);
			//System.out.println("min:"+num);
			if(num==next_2){
				next_2=uglynum[i2]*2;
				i2++;
			}
			if(num==next_3){
				next_3=uglynum[i3]*3;
				i3++;
			}
			if(num==next_5){
				next_5=uglynum[i5]*5;
				i5++;
			}
			System.out.println("next2:"+next_2+" next3:"+next_3+" next5:"+next_5);
			uglynum[i]=num;
		}
		System.out.println(Arrays.toString(uglynum));
		return num;
	}
	public static int min(int a,int b,int c){
		if(a <= b)
		{
		  if(a <= c)
			return a;
		  else
			return c;
		}
		if(b <= c)
		  return b;
		else
		  return c;
	}
	/*public static int min(int i,int j){
		return j<i?j:i;
	}*/
}