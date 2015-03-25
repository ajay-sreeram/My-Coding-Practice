import java.io.*;
//import java.util.*;
public class CodeEValArrayAbsurdity{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null&&line.trim().length()!=0){
			String val[]=line.split(";");
			int n=Integer.parseInt(val[0]);
			String tarr[]=val[1].split(",");
			int arr[]=new int[n];
			int i;
			for(i=0;i<n;i++)
				arr[i]=Integer.parseInt(tarr[i])+1;
			for(i=0;i<n;i++){
				if(arr[Math.abs(arr[i])-1]>0)
					arr[Math.abs(arr[i])-1]*=-1;
				else{
					System.out.println(Math.abs(arr[i])-1);
					break;
				}
			}
		}
	}
}