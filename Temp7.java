import java.util.*;
import java.io.*;
import java.lang.*;
public class Temp7
{
public static void main(String args[])throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int cases=Integer.parseInt(br.readLine());
    String arrr[]=new String[cases];
    String stt[];
    int z;
    for(z=0;z<cases;z++)
        arrr[z]=br.readLine();
    for(z=0;z<cases;z++)
        {
    stt=arrr[z].trim().split(" ");    
int n=Integer.parseInt(stt[0]);
int k=0;
int p=Integer.parseInt(stt[1]);
int temp1;
int arr[]=new int[n+1];
List l=new ArrayList();
for(k=0;k<=n;k++) 
{
temp1=fact(n)/fact(k)/fact(n-k);
arr[k]=temp1;l.add(k,new Integer(temp1));
//System.out.print("  "+temp1);
}
int max=0;
for(k=0;k<=n;k++)
if(arr[k]>max)
max=arr[k];

int print=0,tot=n+1,pow=p;
while(pow<=max)
{
List temp=l;print=0;
for(k=0;k<temp.size();k++)
{
if(((Integer)temp.get(k)).intValue()%pow!=0)
{print++;temp.remove(k);k--;} 
}
l=temp;
    if(print!=0)
System.out.print(print+" ");
else
System.out.print(" ");
pow*=p;
}
if(l.size()!=0)
System.out.println(l.size());
        else
            System.out.println();
    }
    
    }


public static int fact(int num)
{
int pro=1;

for(int i=1;i<=num;i++)
pro*=i;
return pro;
}

}