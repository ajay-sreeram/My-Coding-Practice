import java.io.*;
public class NameString {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String tarr[]=br.readLine().split(" ");
			int a=Integer.parseInt(tarr[0]);
			int b=Integer.parseInt(tarr[1]);
			int c=Integer.parseInt(tarr[2]);
			if(a<=b&&a<=c){
				if(b<c){
					System.out.println(2*b+1);
				}else if(b>c){
					System.out.println(2*c+1);
				}else{
					System.out.println(2*b);
				}
			}else if(b<=a&&b<=c){
				if(a<c){
					System.out.println(2*a+1);
				}else if(a>c){
					System.out.println(2*c+1);
				}else{
					System.out.println(2*a);
				}
			}else if(c<=a&&c<=b){
				if(a<b){
					System.out.println(2*a+1);
				}else if(a>b){
					System.out.println(2*b+1);
				}else{
					System.out.println(2*a);
				}
			}
		}
	}
}
