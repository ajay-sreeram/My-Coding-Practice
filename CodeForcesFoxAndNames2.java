import java.io.*;
import java.util.*;
public final class CodeForcesFoxAndNames2 {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int n=Integer.parseInt(buffer.readLine());
		char arr[]=new char[n];
		int j,i=0;
		String given="";
		for(i=0;i<n;){
			arr[i]=buffer.readLine().charAt(0);
			given=given+arr[i];
			i++;
		}		
		char alp[]=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String result="";
		given=trim(given);
		int alpIndex=0;
		char givenIndexChar=given.charAt(0);
		//System.out.println("GIVEN:"+given);
		int givenIndex=0;
		String res="";
		while(true){
			for(j=alpIndex;j<alp.length;j++){
				if(givenIndexChar==alp[j])
					break;
				if(given.replace(""+alp[j],"").length()==given.length())
					res=res+alp[j];
			}
			alpIndex=j+1;
			//System.out.println("givenindexchar:"+alp[j]);
			
			for(j=givenIndex;j<given.length();j++){
				if(res.replace(""+given.charAt(j),"").length()==res.length()&&((int)given.charAt(j)<(int)alp[alpIndex]))
					res=res+given.charAt(j);
				else
					break;
			}
			
			//System.out.println("res:"+res+" j:"+j);
			givenIndex=j;
			if(j>=given.length()||res.replace(""+given.charAt(j),"").length()!=res.length())
				break;
			
			givenIndexChar=given.charAt(j);
		}
		if(givenIndex<given.length())
			System.out.println("Impossible");
		else{
			for(;alpIndex<alp.length;alpIndex++)
				res=res+alp[alpIndex];
			System.out.println(res);	
		}
		
	}
	public static String trim(String st){
		String res="";
		for(int i=0;i<st.length();){
			char tmp=st.charAt(i);
			res=res+tmp;
			i++;
			while(i!=st.length()&&tmp==st.charAt(i)){
				i++;
			}
		}
		return res;
	}
}
