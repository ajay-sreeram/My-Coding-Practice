import java.io.*;
class SpojEncrypt {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null&&(!line.trim().equals("0"))){
			int n=Integer.parseInt(line);
			char arr[]=buffer.readLine().toCharArray();
			String st="";
			int i,j;
			int r=arr.length/n;
			char grid[][]=new char[r][n];
			
			System.out.println(st);
		}
	}
}
