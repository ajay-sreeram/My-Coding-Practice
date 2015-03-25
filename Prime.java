import java.io.*;
import java.util.*;
public class Prime{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());	
		int mul[]=new int[32000];
		int i,j,n=0,cnt=0;
		for(i=2;i<32000;i++){
			if(mul[i]==1)
				cnt++;
			else
				for(j=2,n=i*j;n<32000;j++){
					if(mul[n]==0){
						mul[n]=1;
					}
					n=i*j;
				}
		}
		int res[]=new int[cnt];
		int k=0;
		for(k=0,i=2;i<32000;i++)
			if(mul[i]==0)
				res[k++]=i;
		while(t--!=0){
			String starr[]=br.readLine().trim().split(" ");
			int m;
			m=Integer.parseInt(starr[0]);
			n=Integer.parseInt(starr[1]);
			if(m==1)
				m++;
			for(;m<=n;m++){
				boolean flag=true;
				int tmp=(int)Math.sqrt(m);
				for(i=0;res[i]<=tmp;i++)
					if(m%res[i]==0){
						flag=false;
						break;
					}
				if(flag){
					System.out.println(m);
				}
			}
			System.out.println();
		}
	}
}
