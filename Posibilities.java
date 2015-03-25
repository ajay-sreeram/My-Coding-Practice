import java.io.*;
public class Posibilities {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,j,k,n=Integer.parseInt(br.readLine());
		for(i=0;i<=1;i++){
			for(j=0;j<=1;j++){
				for(k=0;k<=1;k++)
				System.out.println(i+" "+j+" "+k);
			}
		}
		System.out.println("-------------------");
		rec(new int[3],0);
	}
	public static void rec(int arr[],int d){
		if(d==3){
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[j]+" ");
			System.out.println();
			return;
		}
		for(int i=0;i<=1;i++){
			arr[d]=i;
			rec(arr,d+1);
		}
			
	}
}
