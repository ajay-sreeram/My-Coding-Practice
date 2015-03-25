import java.io.*;
import java.util.*;
public class Alha1 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String tarr[]=br.readLine().trim().split(" ");
		int n=Integer.parseInt(tarr[0]);
		int q=Integer.parseInt(tarr[1]);
		tarr=br.readLine().trim().split(" ");
		int i;
		int pa[]=new int[n];
		int qa[]=new int[n];
		for(i=0;i<n;i++)
			pa[i]=Integer.parseInt(tarr[i]);
		tarr=br.readLine().trim().split(" ");
		for(i=0;i<n;i++)
			qa[i]=Integer.parseInt(tarr[i]);
		for(i=0;i<q;i++){
			tarr=br.readLine().trim().split(" ");
			int s=Integer.parseInt(tarr[0]);
			int e=Integer.parseInt(tarr[1]);
			int npa[]=Arrays.copyOfRange(pa,s-1,e);
			int nqa[]=Arrays.copyOfRange(qa,s-1,e);
			Arrays.sort(npa);
			Arrays.sort(nqa);
			int sum=0;
			for(int j=0;j<npa.length;j++)
				sum+=npa[j]*nqa[j];
			//System.out.println("NA:"+Arrays.toString(npa)+" NQ:"+Arrays.toString(nqa));
			System.out.println(sum);
		}
	}
}
