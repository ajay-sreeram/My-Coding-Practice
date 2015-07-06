import java.io.*;
public class IsByteShortIntLong{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{	
			int check=0;
			int arr[]=new int[4];
			String st=br.readLine();
			try{
				byte l=Byte.parseByte(st);
				arr[0]=1;
				check=1;
			}catch(Exception e){
			}
			try{
				short l=Short.parseShort(st);
				arr[1]=1;
				check=1;
			}catch(Exception e){
			}
			try{
				int l=Integer.parseInt(st);
				arr[2]=1;
				check=1;
			}catch(Exception e){
			}
			try{
				long l=Long.parseLong(st);
				arr[3]=1;
				check=1;
			}catch(Exception e){
			}
			if(check == 0){
				System.out.println(st+" can't be fitted anywhere.");
				continue;
			}
			System.out.println(st+" can be fitted in:");
			if(arr[0]==1){
				System.out.println("* byte");
			}
			if(arr[1]==1){
				System.out.println("* short");
			}
			if(arr[2]==1){
				System.out.println("* int");
			}
			if(arr[3]==1){
				System.out.println("* long");
			}
		}
	}
}