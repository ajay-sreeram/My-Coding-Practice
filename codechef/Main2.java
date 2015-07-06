import java.io.*;
public class Main{
public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 int cases=Integer.parseInt(br.readLine());
		 for(int t=0;t<cases;t++){
			 int n=Integer.parseInt(br.readLine());
			 char arr[][]=new char[n][n];
			 for(int i=0;i<n;i++){
				 arr[i]=br.readLine().trim().toCharArray();
			 }
			 int cnt=0;
			 for(int i=0;i<n;i++){
				 for(int j=0;j<arr[i].length;j++){
					 if(check(arr,i,j))
						cnt++;
				 }
			 }
			 System.out.println(cnt);
		 }
		 
	}
	public static boolean check(char[][] arr,int i,int j){
		if(i<0||j<0||i>=arr.length||j>=arr[i].length)
			return false;
		if(arr[i][j]=='1'){
			arr[i][j]=0;
			check(arr,i+1,j);
			check(arr,i-1,j);
			check(arr,i,j+1);
			check(arr,i,j-1);
			return true;
		}else
			return false;
	}
}