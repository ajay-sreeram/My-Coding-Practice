import java.io.*;
public class Solution3
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String temp;
int n=Integer.parseInt(br.readLine());
int p,i,j,k;
String st;
int result[]=new int[n];
for(p=0;p<n;p++)
{
 temp=br.readLine();
  if(check(temp)>0)
    {
       for(i=0,j=temp.length()-1;i<=j;i++,j--)
	 if(temp.charAt(i)!=temp.charAt(j))
                   {
                      st=temp.substring(0,i)+temp.substring(i+1,temp.length());
		if(check(st)<0)
 			{
			//System.out.println(i);
			result[p]=i;
			break;
			}
		
		st=temp.substring(0,j)+temp.substring(j+1,temp.length());
		if(check(st)<0)
 			{
			//System.out.println(j);
			result[p]=j;
			break;
			}
		
   	    }
	}
  	else
  	 {//System.out.print("-1");
	result[p]=-1;
	}
}


for(i=0;i<n;i++)
System.out.println(result[i]);
}
public static int check(String st)
{
 int i,j;
 for(i=0,j=st.length()-1;i<=j;i++,j--)
 if(st.charAt(i)!=st.charAt(j))
 return 1;
return -1;
}
}