
import java.io.*;
import java.util.*;
public class HackerEarthPledge {
	public static void main (String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int n=Integer.parseInt(buffer.readLine());
		while((line=buffer.readLine())!=null){
			n=Integer.parseInt(buffer.readLine());
			String arr[]=new String[n];
			int i;
			for(i=0;i<n;i++){
				char tmparr[]=buffer.readLine().toCharArray();
				Arrays.sort(tmparr);
				arr[i]=new String(tmparr);
				System.out.println("arr["+i+"]: "+arr[i]);
			}
			int cnt[]=new int[n];
			function(line,arr,cnt);
			for(i=0;i<cnt.length;i++)
				System.out.println(cnt[i]);
		}
	}
	//Number os substrings of s that contain anagram of qstr
	public static void function(String stmt,String words[],int cnt[]){
		String st;
		int i,j,k;
		for(i=0;i<stmt.length();i++){
			for(j=i+1;j<=stmt.length();j++){
				//System.out.println("i:"+i+" j:"+j);
				char tmparr[]=stmt.substring(i,j).toCharArray();
				Arrays.sort(tmparr);
				st=new String(tmparr);
				System.out.println("st:"+st);
				for(k=0;k<words.length;k++)
					if(st.indexOf(words[k])!=-1)
						cnt[k]++;
			}
		}	
		/*for(int j=1;j<=stmt.length();j++){
			st1=stmt.substring(0,j);
			if(j!=stmt.length())
				st2=stmt.substring(j,stmt.length());
			else
				st2="";
			System.out.print(" st1:"+st1+" st2:"+st2);
			for(int i=0;i<words.length;i++){
				if(st1.indexOf(words[i])!=-1)
					cnt[i]++;
				if(st2.indexOf(words[i])!=-1)
					cnt[i]++;
			}
		}*/
		/*for(int k=0;k<stmt.length();k++){
			for(int j=k+1;j<=stmt.length();j++){
				st1=stmt.substring(k,j);
				for(int i=0;i<words.length;i++){
				if(st1.indexOf(words[i])!=-1)
					cnt[i]++;
				}
			}
		}*/
	}
}