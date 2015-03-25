import java.io.*;
public class Sherlock2 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int test=Integer.parseInt(br.readLine());
		for(int t=0;t<test;t++){
			String tarr[]=br.readLine().trim().split(" ");
			String tarr1[]=tarr[0].trim().split(":");
			int sd=Integer.parseInt(tarr1[0]);
			int sm=Integer.parseInt(tarr1[1]);
			int sy=Integer.parseInt(tarr1[2]);
			tarr1=tarr[1].trim().split(":");
			int ed=Integer.parseInt(tarr1[0]);
			int em=Integer.parseInt(tarr1[1]);
			int ey=Integer.parseInt(tarr1[2]);
			int cnt=0;
			int tmp;
			tmp=sy%100;
			if(tmp<=13&&tmp>=3)
				if(sm<=tmp-1&&sd<=tmp-2)
					cnt++;
			tmp=ey%100;
			if(tmp<=13&&tmp>=3)
				if(em>=tmp-1&&ed>=tmp-2)
					cnt++;
			//System.out.println("tmp:"+tmp+" 
			for(int i=sy+1;i<=ey-1;i++){
				tmp=i%100;
				if(i<=13&&i>=3)
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}
