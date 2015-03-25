import java.io.*;
public class Smiley {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		String tarr[]=br.readLine().trim().split(" ");
		int i,cnt=0;
		int arr1[]=new int[61];
		int n=0;		
		for(i=0;i<tarr.length;i++)
			if(arr1[Integer.parseInt(tarr[i])]==0){
				arr1[Integer.parseInt(tarr[i])]=1;
				n++;
			}
		while(!(line=br.readLine().trim()).equals("0")){
			tarr=line.split(" ");
			int arr2[]=new int[61];
			
			for(i=0;i<tarr.length;i++)
				arr2[Integer.parseInt(tarr[i])]=1;
			
			int tmp=0;
			
			for(i=0;i<arr1.length;i++)
				if(arr1[i]==arr2[i]){
					tmp++;
				}
					
			
			if(tmp==61)
				cnt++;
		}
		System.out.println(cnt);
	}
}
