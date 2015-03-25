import java.io.*;
import java.util.*;
public class CodeEvalTooUnique{
	public static int rlen;
	public static int clen;
	public static int maxlen;
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		List<String> list=new ArrayList<String>();
		while((line=br.readLine())!=null&&line.trim().length()!=0){
			list.add(line);
		}
		rlen=list.size();
		clen=list.get(0).toString().length();
		char arr[][]=new char[rlen][];
		int i,j;
		for(i=0;i<rlen;i++)
			arr[i]=list.get(i).toCharArray();
		maxlen=0;
		fun(arr,0,0,1,1);
		System.out.println("MAX LEN:"+maxlen);
	}
	
	public static void fun(char arr[][],int i,int j,int r,int c){
		if(i+r-1>=rlen||j+c-1>=clen)
				return;
		System.out.println(" {i:"+i+"j:"+j+"}=>("+r+","+c+")");
		int check[]=new int[26];
		int ti=0,tj=0;
		for(ti=i;ti<r+i;ti++)
			for(tj=j;tj<c+j;tj++)
				if(check[(int)arr[ti][tj]-97]==1)
						break;
				else
					check[(int)arr[ti][tj]-97]=1;
		if(ti==r+i&&tj==c+j)
		{
			if(r*c>maxlen)
					maxlen=r*c;	
			System.out.println("SUCESS:"+maxlen);
			fun(arr,i,j,r+1,c);
			fun(arr,i,j,r,c+1);
		}
		else{
			fun(arr,ti,tj,r,c);
			fun(arr,ti,tj,r,c);
		}
	}
}
