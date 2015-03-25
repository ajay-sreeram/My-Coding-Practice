import java.io.*;
public class CodeEvlSelfDescribingNumbers{
public static void main(String args[])throws IOException{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while ((line = buffer.readLine()) != null) {
		int n=Integer.parseInt(line);
		int arr[]=new int[10];
		int zeros=1;
		int tmp=n;
		while(tmp!=0){
			arr[tmp%10]++;
			tmp/=10;
			zeros*=10;
		}
		zeros/=10;
		boolean check=true;
		int ptr=0;
		while(zeros!=0){
			if(arr[ptr]!=((n/zeros)%10))
			{
				check=false;
				break;
			}
			zeros/=10;
			ptr++;
		}
		if(check)
			System.out.println("1");
		else
			System.out.println("0");
		
	}
}
}