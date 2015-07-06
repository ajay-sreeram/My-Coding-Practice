import java.io.*;
public class RoofFloor1 {
	 public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int i;
		int p=-1;
		int arr[]=new int[n];
		int tot=0;
		for(i=0;i<n;i++){
			int num=Integer.parseInt(br.readLine());
			arr[i]=num;
			if(num==0){
				if(p>0){
					tot-=arr[p];
					p--;	
				}				
			}else{
			tot+=num;
			p=i;
			}
		System.out.println("prev: "+arr[p]+" index:"+p);
		}
		System.out.println(tot);
	}
}
