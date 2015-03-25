import java.io.*;
public class 1807 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		line=br.readLine();
		char arr[]=line.toCharArray();
		char arr2[]=new char[line.length]
		int i=0,cnt=0;
		for(i=0,j=0;i<arr.length;i++)
			if(arr[i]=='1')
				arr2[j++]='1';
		for(i=0;i<arr.length;i++)
			if(arr[i]=='8')
				arr2[j++]='8';
		for(i=0;i<arr.length;i++)
			if(arr[i]=='0')
				arr2[j++]='0';
		for(i=0;i<arr.length;i++)
			if(arr[i]=='7')
				arr2[j++]='7';
		System.out.println(new String(arr));
		System.out.println(new String(arr2));
	}
}
