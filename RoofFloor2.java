import java.io.*;
import java.util.*;
public class RoofFloor2 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		//int i;
		for(int c=0;c<t;c++){
			int n=Integer.parseInt(br.readLine());
			String tarr[]=br.readLine().split(" ");
			int arr[]=new int[n];
			int i=0,j=n-1;
			for(i=0;i<n;i++)
				arr[i]=Integer.parseInt(tarr[i]);
			i=0;
			int b=0;
			int g=arr[j]<<1;
			arr[j]=0;
			while(i<=j&&g>0){
				//System.out.println("b: "+b+" g:"+g);
				for(;i<=j&&b<g;i++){
					b+=arr[i];
					arr[i]=0;
				}	
				b-=g;
				g=0;
				if(i<j&&arr[j-1]!=0){
					g=arr[--j]<<1;
					//System.out.println("j:"+j+" special: "+Arrays.toString(arr));
				}
					
				arr[j]=0;
			}
			//System.out.println(Arrays.toString(arr));
			System.out.println(i+" "+(n-j));
		}
	}
}
