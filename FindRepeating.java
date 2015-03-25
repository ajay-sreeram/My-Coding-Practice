import java.io.*;
class FindRepeating {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			char arr[]=line.toCharArray();
			int n=arr.length;
			for(int i=0;i<n;i++)
				for(int j=i+1;j<n;)
					if(arr[j]==arr[i])
						arr[j]=arr[--n];
					else
						j++;
			for(int i=0;i<n;i++)
				System.out.print(arr[i]);
		}
	}
}
