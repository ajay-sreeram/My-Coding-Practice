import java.io.*;
public class Sherlock {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int tests=Integer.parseInt(br.readLine());
		for(int t=0;t<tests;t++){
			String tarr[]=br.readLine().split(" ");
			int n=Integer.parseInt(tarr[0]);
			int k=Integer.parseInt(tarr[1]);
			int i,p=Integer.parseInt(tarr[2]);
			tarr=br.readLine().split(" ");
			int tmp=p;
			for(i=0;i<k;i++){
				int tk=Integer.parseInt(tarr[i]);
				if(tk<p)
					tmp++;
			}
			if(tmp>n)
				System.out.println("-1");
			else
				System.out.println(tmp);
		}
	}
}
