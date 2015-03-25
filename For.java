import java.io.*;
class For {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			int n=Integer.parseInt(buffer.readLine().trim());
			for(int i=0;i<n;i++){
				System.out.println("i:"+i);
				System.out.println("n:"+n);
				--n;
			}
		}
	}
}
