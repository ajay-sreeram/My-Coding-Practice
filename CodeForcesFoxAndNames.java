import java.io.*;
import java.util.*;
class CodeForcesFoxAndNames {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int n=Integer.parseInt(buffer.readLine());
		char arr[]=new char[n];
		int i=0;
		String given="";
		for(i=0;i<n;){
			arr[i]=buffer.readLine().charAt(0);
			given=given+arr[i];
			i++;
		}
		
		char alp[]=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String result="";
		//System.out.println(Arrays.toString(arr));
		given=trim(given);
		char ch=given.charAt(0);
		given=given.substring(1,given.length());
		for(i=0;i<alp.length;i++){
			if(ch==alp[i])
				break;
			if(given.replace(""+alp[i],"").length()==given.length())
				result=result+alp[i];
		}
		char index=alp[i+1];
		for(i=0;i<given.length;){
			while(i<given.length&&(int)given.charAt(i)<(int)index){
				if(result.replace(""+given.charAt(i),"").length()==result.length())
					result=result+given.charAt(i);
				else
					break;
				i++;
			}
			index=given.charAt(i);
			for(i=0;i<alp.length;i++){
				if(ch==alp[i])
					break;
				if(given.replace(""+alp[i],"").length()==given.length())
					result=result+alp[i];
			}
			//if((int)given.charAt(i)<(int)index)
				
		}
		
		
		for(i=0;i<given.length();i++){
			if(result.replace(""+given.charAt(i),"").length()==result.length())
				result=result+given.charAt(i);
			else
				break;
		}
		
		if(i!=given.length())
			System.out.println("Impossible");
		else{
			for(i=0;i<alp.length;i++)
			if(result.replace(""+alp[i],"").length()==result.length())
				result=result+alp[i];
			System.out.println(result);
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
