import java.io.*;
import java.util.*;
public class SpojFactorial2{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		while((line=br.readLine())!=null){
			int n=Integer.parseInt(line)-1;
			if(n<=0){
				System.out.println("0");
				continue;
			}
			int res_size=1;
			int res[]=new int[1000000];
			Arrays.fill(res,1);
			for(int i=2;i<=n;i++)
				res_size=multiply(i,res,res_size);
			
			int cnt=0;
			for(int i=res_size-1;i>=0;i--,cnt++){
				System.out.print(res[i]);
			}
			System.out.println();
		}
	}
	public static int multiply(int num,int res[],int res_size){
		int carry=0;
		for(int i=0;i<res_size;i++){
			int tmp=res[i]*num+carry;
			res[i]=tmp%10;
			carry=tmp/10;
		}
		while(carry!=0){
			res[res_size]=carry%10;
			carry/=10;
			res_size++;
		}
		return res_size;
	}
}