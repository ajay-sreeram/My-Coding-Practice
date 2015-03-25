import java.io.*;
import java.util.*;
class HackerRankElementAtKthRotation {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter("out.txt");
		String tarr[]=buffer.readLine().split(" ");
		int n=Integer.parseInt(tarr[0]);
		int k=Integer.parseInt(tarr[1]);
		int q=Integer.parseInt(tarr[2]);
		tarr=buffer.readLine().split(" ");
		int i,j,sum;
		k=k%n;
		for(i=0;i<k;i++){
			j=n-1-i;
			if(j-k>=0){
				for(;j>=0;j-=k){
					if(j-k>=0){
						String tmp=tarr[j];
						tarr[j]=tarr[j-k];
						tarr[j-k]=tmp;
					}
					/* else{
						String tmp=tarr[j];
						tarr[j]=tarr[0];
						tarr[0]=tmp;
					} */
				}
			}
			else{
				String tmp=tarr[j];
				tarr[j]=tarr[0];
				tarr[0]=tmp;
			}
		} 

		for(i=0;i<q;i++){
			int index=Integer.parseInt(buffer.readLine());
			//System.out.println("P: "+tarr[index]);
			out.println(tarr[index]);
			}
		out.close();
	}
}