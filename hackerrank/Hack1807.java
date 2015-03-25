import java.io.*;
public class Hack1807 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		line=br.readLine();
		char arr[]=line.toCharArray();
		char arr2[]=new char[line.length()];
		int i=0,cnt=0,j;
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
		longestCommonSubSequence(arr,arr2);
	}
	public static void longestCommonSubSequence(char arr[],char arr2[]){
		int n=arr.length;
		int ch[][]=new int[n+1][n+1];
		for(int i=n-1;i>=0;i--){
			for(int j=n-1;j>=0;j--){
				if(arr[i]==arr2[j])
					ch[i][j]=ch[i+1][j+1]+1;
				else{
					ch[i][j]=max(ch[i+1][j],ch[i][j+1]);
				}
			}
		}
		System.out.println(ch[0][0]);
		//System.out.println(n);
		
	}
	public static int max(int a,int b){
		return a>b?a:b;
	}
}
