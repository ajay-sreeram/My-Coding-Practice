import java.util.*;
public class MeritD1
{
public static void main(String[] args) 
{
int number=6;
List<String> l=new ArrayList<String>();
int i,j,k,n;
n=number;
if(n<=0)
return l;
int a[]=new int[n];
int b[]=new int[n];
int c[]=new int[n];
int p,q,r;
String st="";
for(n=number;n>0;n--)
{
for(i=0;i<=n;i++)
{
  for(j=0;j<n-i;j++)
    {
     a[j]=1;
    }
 for(k=n-i;k<n;k++)
   {
     a[k]=2;
   }
 for(k=0;k<n;k++)
 {
   b[k]=a[k];
  }

for(p=0;p<n;p++)
{
   for(q=0;q<n-p-1;q++)//q=0,q<n-p-1
  {
    k=b[q];
    b[q]=b[q+1];
    b[q+1]=k;
    int sum=0;
     st="";
      for(r=0;r<n;r++)
     st+=b[r];      
     for(r=0;r<n;r++)
    sum+=b[r];
    System.out.println(st+":"+sum);
    
    //System.out.println(sum);
    if(sum==number)
   {
	//System.out.println(st);
	Object o[]=l.toArray();
	String sta[]=new String[o.length];
	for(r=0;r<o.length;r++)
	{
	sta[r]=(String)o[r];
	}
	int count=0;
	for(r=0;r<o.length;r++)
	if(st.equals(sta[r]))
	count++;
	if(count==0)
	l.add(st);
    }
  }
if(number==2)
{r=2;l.add(""+r);}
  }

 }
}
Iterator it=l.iterator();
while(it.hasNext())
{
String v=(String)it.next();
System.out.println("Value:"+v);
}


}
}