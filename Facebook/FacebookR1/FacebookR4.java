import java.io.*;
import java.util.*;
public class FacebookR4{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
String line;
for(int cas=1;cas<=n;cas++){
int len=Integer.parseInt(br.readLine());
line=br.readLine().trim();
String tarr[]=line.split(" ");
ArrayList<Integer>[] larr = (ArrayList<Integer>[])new ArrayList[len];
int i;
int arr[]=new int[len];
for(i=0;i<len;i++){
   arr[i]=Integer.parseInt(tarr[i]);
   larr[i]=new ArrayList<Integer>();
  }
int cntr=0;
for(i=len-1;i>=0;i--){
   int j=1;
   while(true){
     if(!larr[i].contains(j)){
		if(arr[i]!=0)
			if(!larr[arr[i]-1].contains(j))
				larr[arr[i]-1].add(j);
        cntr+=j;
        break;
     }
	 j++;
  }
}
System.out.println("Case #"+cas+": "+cntr);
}
}
}