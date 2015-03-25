import java.io.*;
//import java.util.*;
public class CodeEvalSudoku{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null&&line.trim().length()!=0){
			String val[]=line.split(";");
			int size=Integer.parseInt(val[0]);
			int n=(int)Math.sqrt(size);
			String tarr[]=val[1].split(",");
			int i,j,k=0;
			int arr[][]=new int[size][];
			for(i=0;i<size;i++){
				arr[i]=new int[size];	
				for(j=0;j<size;j++)
					arr[i][j]=Integer.parseInt(tarr[k++]);
			}
			if(checkFun(arr,n))
				System.out.println("True");
			else
				System.out.println("False");
		}
	}

	public static boolean checkFun(int arr[][],int n){
	int i,j;
	int sqr=n*n;
	boolean check[];
	for(i=0;i<sqr;i++){
		check=new boolean[sqr];
		for(j=0;j<sqr;j++)
			if(check[arr[i][j]-1]==false)
				check[arr[i][j]-1]=true;
			else
				return false;
		check=new boolean[sqr];
		for(j=0;j<sqr;j++)
			if(check[arr[j][i]-1]==false)
				check[arr[j][i]-1]=true;
			else
				return false;
	}
	int p,q;
	for(i=0;i<sqr;i+=n){
		for(j=0;j<sqr;j+=n){
			check=new boolean[sqr];
			for(p=0;p<n;p++)
				for(q=0;q<n;q++)
					if(check[arr[i+p][j+q]-1]==false)
						check[arr[i+p][j+q]-1]=true;
					else
						return false;
		}
	}
	return true;
	}
}