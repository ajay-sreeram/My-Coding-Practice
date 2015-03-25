import java.io.*;
//import java.util.*;
//import java.text.*;
public class Try1 {
    public static void main (String[] args) throws IOException {
 
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		while((line=buffer.readLine())!=null){
			String given[]=line.split(",");
			String stmt=given[0].trim();
			String test=given[1].trim();
			//test=test.replace('*','#');
			if(test.indexOf('*')!=-1){	
				String arr[]=test.split("\\*");
				int ptr[]=new int[arr.length];
				int i,j=stmt.indexOf(arr[0]);
				ptr[0]=j;
				boolean check=true;
				for(i=1;i<arr.length;i++){
					j=stmt.substring(j+arr[0].length(),stmt.length()).indexOf(arr[i]);
					ptr[i]=j;
					if(j==-1)
						{
						System.out.println("false");
						check=false;
						break;
						}
				}
				if(check)
					System.out.println("true");
				
			}
			else
				if(stmt.indexOf(test)!=-1)
					System.out.println("true");
				else
					System.out.println("false");
		}
	}
}