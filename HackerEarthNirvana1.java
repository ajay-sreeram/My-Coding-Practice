import java.util.*;
public class HackerEarthNirvana1 {
	public static void main(String[] args)	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int k=0;k<n;k++){
			int t=in.nextInt();
			int cnt=0;
			while(t!=0){
				if((t&1)==1)
					cnt++;
				t>>=1;
			}
			System.out.println(cnt);
		}
	}
}
