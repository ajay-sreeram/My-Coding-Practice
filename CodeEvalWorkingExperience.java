import java.io.*;
import java.util.*;
import java.text.*;
public class CodeEvalWorkingExperience {
    public static void main (String[] args) throws IOException {
 
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		while((line=buffer.readLine())!=null){
			String vals[]=line.split(";");
			List<String> list=new ArrayList<String>();
			for(int i=0;i<vals.length;i++)
			{
				String tmpval[]=vals[i].trim().split("-");
				add(list,tmpval[0].trim(),tmpval[1].trim());
			}
			//System.out.println(list);
			System.out.println((int)(list.size()/12));

		}
	}
	public static void add(List<String> list,String from,String to){
		String m[]=new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String tmp1[]=from.split(" ");
	//	String tmp2[]=to.split(" ");
		int month=0;
		int i;
		for(i=0;i<m.length;i++)
			if(tmp1[0].equals(m[i]))
			{month=i;break;}
		int startyear=Integer.parseInt(tmp1[1]);
		String st="";
		while(true){
			if(st.equals(to))
				break;
			if(i==12){
				i=0;
				startyear++;
			}
			st=m[i]+" "+startyear;
			if(!list.contains(st))
				list.add(st);
			i++;
		}	
	
	}
}
