import java.io.*;
public class HackerRankSheduling{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int numEmp=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int start[]=new int[n];
		int end[]=new int[n];
		for(int i=0;i<n;i++){
			String tmparr[]=br.readLine().split(" ");
			String tmp[]=tmparr[0].split(":");
			int s=Integer.parseInt(tmp[0]);
			if(s<8){
				s+=12;
			}
			s=Integer.parseInt(s+tmp[1]);
			tmp=tmparr[1].split(":");
			int e=Integer.parseInt(tmp[0]);
			if(e<9){
				if(e==8){
					if(Integer.parseInt(tmp[1])==0)
						e=e+12;
				}
				else
					e+=12;
			}
			e=Integer.parseInt(e+tmp[1]);
			start[i]=s;
			end[i]=e;
			//System.out.println(s+" : "+e);
		}
		sort(start,end);
		//System.out.println("sorted:");
		/* for(int i=0;i<n;i++)
			System.out.println(start[i]+" : "+end[i]); */
		int i,j,cnt=0;
		boolean check[]=new boolean[n];
		for(i=0;i<numEmp;i++){
			int ptr=0;
			while(true){
				if(ptr==n)
					break;
				if(check[ptr]==false){
					check[ptr]=true;
					//System.out.println("s i:"+i+" P:"+ptr);
					cnt++;
					break;
				}
				ptr++;
			}
			for(j=ptr;j<n;j++){
				if(check[j]==false&&start[j]>=end[ptr]){
					check[j]=true;
					cnt++;
					ptr=j;
					//System.out.println("i:"+i+" P:"+j+" ptr:"+ptr);
				}
			}
			if(cnt==n)
				break;
		}
		System.out.println(cnt);
	}
	public static void sort(int start[],int end[]){
		for(int i=0;i<start.length;i++){
			for(int j=i+1;j<start.length;j++){
				if(end[i]>end[j]){
					end[i]=end[i]+end[j];
					end[j]=end[i]-end[j];
					end[i]=end[i]-end[j];
					
					start[i]=start[i]+start[j];
					start[j]=start[i]-start[j];
					start[i]=start[i]-start[j];
				}
			}
		}
	}
}