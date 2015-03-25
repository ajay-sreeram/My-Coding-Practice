import java.io.*;
import java.util.*;
public class Facebook2 {
	public static void main (String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader buffer=new BufferedReader(new FileReader("input.in"));
		//PrintWriter out=new PrintWriter("output.out");
		String line=buffer.readLine();
		while((line=buffer.readLine())!=null){
			String tmparr[]=line.split(" ");
			int p=Integer.parseInt(tmparr[0]);
			int c=Integer.parseInt(tmparr[1]);
			int f=Integer.parseInt(tmparr[2]);
			int n=Integer.parseInt(buffer.readLine().trim());
			int i,j,cntr;
			int parr[]=new int[n];
			int carr[]=new int[n];
			int farr[]=new int[n];
			for(i=0;i<n;i++){
				tmparr=buffer.readLine().trim().split(" ");
				parr[i]=Integer.parseInt(tmparr[0]);
				carr[i]=Integer.parseInt(tmparr[1]);
				farr[i]=Integer.parseInt(tmparr[2]);
			}
			boolean check=true;
			for(i=0;i<n;i++){
				int tp=p,tc=c,tf=f;
				if(check)
				for(j=i,cntr=0;cntr<n;j++,cntr++){
					if(j==n)
						j=0;
					int tmpP=tp-parr[j];
					int tmpC=tc-carr[j];
					int tmpF=tf-farr[j];
					if(tmpP==0&&tmpC==0&&tmpF==0){
						check=false;
						break;
					}
					if(tmpP>0&&tmpC>0&&tmpF>0){
						tp=tmpP;
						tc=tmpC;
						tf=tmpF;
					}
				}
				else
					break;
			}
			if(check==false)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}