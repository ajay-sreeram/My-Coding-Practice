import java.io.*;
import java.util.*;
public class CodeEvalPrime{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int mul[]=new int[65537];
		int i,j,n=0,cnt=0;
		for(i=2;i<65536;i++){
			if(mul[i]==1)
				cnt++;
			else
				for(j=2,n=i*j;n<65536;j++){
					if(mul[n]==0){
						mul[n]=1;
					}
					n=i*j;
				}
		}
		int res[]=new int[cnt];
		int k=0;
		for(k=0,i=2;i<65536;i++)
			if(mul[i]==0)
				res[k++]=i;
		while((line=br.readLine())!=null){
			long m;
			m=2;
			String st="";
			long n1=Long.parseLong(line);
			for(;m<=n1;m++){
				boolean flag=true;
				int tmp=(int)Math.sqrt(m);
				for(i=0;res[i]<=tmp;i++)
					if(m%res[i]==0){
						flag=false;
						break;
					}
				if(flag){
					st=st+m+",";
				}
			}
			System.out.println(st.substring(0,st.length()-1));
		}
	}
}