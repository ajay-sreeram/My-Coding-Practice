import java.io.*;
import java.util.*;
class HackerRankHandShake {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line=buffer.readLine();
		while((line=buffer.readLine())!=null){
			int n=Integer.parseInt(line);
			System.out.println((int)(n*(n-1)/2));
		}
	}
}
		/* 	 int arr[]=new int[10000];
			 Arrays.fill(arr,1);
			 size=1;
			 int n=Integer.parseInt(line)-1;
			 if(n<=0){
				System.out.println(0);
				continue;
			 }
			 fun(arr,n-1);
			 for(int i=size-1;i>=0;i--)
				 System.out.print(arr[i]);
			 System.out.println();
		}
	}
	public static void fun(int arr[],int n){
		int carry=0;
		if(n==1){
			return;
		}
		int i;
		for(i=0;i<size;i++){
			int tmp=arr[i]*n+carry;
			arr[i]=tmp%10;
			carry=tmp/10;
		}
		while(carry!=0){
			arr[size]=carry%10;
			carry/=10;
			i++;
		}
		fun(arr,n-1);
	}
}
 */