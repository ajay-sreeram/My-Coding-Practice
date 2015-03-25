import java.io.*;
public class CodeEvalQueryBoard{
public static void main (String[] args) throws IOException {
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    String line;//=buffer.readLine();
	int grid[][]=new int[256][256];
	while((line=buffer.readLine())!=null){
		String arr[]=line.split(" ");
		int i,set,val,sum;
		if(arr[0].equals("SetCol")){
			set=Integer.parseInt(arr[1]);
			val=Integer.parseInt(arr[2]);
			for(i=0;i<256;i++){
				grid[i][set]=val;
			}
		}
		else if(arr[0].equals("SetRow")){
			set=Integer.parseInt(arr[1]);
			val=Integer.parseInt(arr[2]);
			for(i=0;i<256;i++){
				grid[set][i]=val;
			}
		}
		else if(arr[0].equals("QueryCol")){
			sum=0;
			set=Integer.parseInt(arr[1]);
			for(i=0;i<256;i++){
				sum+=grid[i][set];
			}
			System.out.println(sum);
		}
		else if(arr[0].equals("QueryRow")){
			sum=0;
			set=Integer.parseInt(arr[1]);
			for(i=0;i<256;i++){
				sum+=grid[set][i];
			}
			System.out.println(sum);
		}
	}
}
}