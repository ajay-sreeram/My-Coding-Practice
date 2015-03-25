import java.io.*;
public class Solution6
{
public static void main(String args[])throws IOException
    {
int input,i,j,n,count,res=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int test=Integer.parseInt(br.readLine());
	for(int k=0;k<test;k++)
{
input=Integer.parseInt(br.readLine());
i=0;
n=4;
res=0;
label:
for(count=0;count<10000;count++)
{
 for(j=1;j<=5;i++,j++)
 if(i==input)
 {res = (5*(i-count));break label;}
 if(i==input)
 {res = (5*(i-count));break label;}
 i++;
}
System.out.println(res);
} 

}
}
