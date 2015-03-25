import java.io.*;
//import java.util.*;
public class MinDivHack {
	static int res,n;
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tests=Integer.parseInt(br.readLine());
		for(int z=0;z<tests;z++){
			n=Integer.parseInt(br.readLine());
			String tarr[]=br.readLine().split(" ");
			int arr[]=new int[tarr.length];
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(tarr[i]);
			res=0;
			loop(arr);
			System.out.println(res);
		}
	}
	public static void loop(int arr[])throws IOException{
		int mine,mino,cnte,cnto,cnt1;
		cnte=cnto=cnt1=0;
		mine=mino=Integer.MAX_VALUE;			
		for(int i=0;i<n;i++){
			int tmp=arr[i];
			if(tmp%2==0){
				if(tmp<mine)
					mine=tmp;
				cnte++;
			}else{
				if(tmp==1)
					cnt1++;
				else{
					if(tmp<mino)
						mino=tmp;
					cnto++;
				}
			}
		}
		if(cnt1==n)
			return;
		else{
			res++;
			int tmp=1;
			if(cnte==0){
				divide(arr,mino);
			}else if(cnto==0){
				divide(arr,mine);
			}
			else if(cnte>cnto)
				divide(arr,mine);
			else if(cnto>cnte)
				divide(arr,mino);
			else{
				if(mine>mino)
					divide(arr,mine);
				else
					divide(arr,mino);
			}
		}
	}
	public static void divide(int arr[],int t)throws IOException{
		for(int i=0;i<n;i++)
			if(arr[i]!=1&&arr[i]%t==0)
				arr[i]=arr[i]/t;
		loop(arr);
	}
}
