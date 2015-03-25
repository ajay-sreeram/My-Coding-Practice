import java.io.*;
//sm of contagius and non contagious subarray
public class SumConandNonConSubArr {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int tests=Integer.parseInt(br.readLine());
		for(int t=0;t<tests;t++){
			int n=Integer.parseInt(br.readLine());
			String tarr[]=br.readLine().trim().split(" ");
			int maxnon=0,maxcon=0,tillnow=0;
			for(int i=0;i<n;i++){
				int num=Integer.parseInt(tarr[i]);
				if(i==0){
					if(num>=0)
						maxnon=num;
					else
						maxnon=0;
					maxcon=tillnow=num;
				}
				else{
					tillnow=max(num,tillnow+num);
				maxcon=max(maxcon,tillnow);
				if(num>0)
					maxnon+=num;
				}
			}
			System.out.println(maxcon+" "+maxnon);
		}
	}
	public static int max(int a,int b){
		return a>b?a:b;
	}
}
