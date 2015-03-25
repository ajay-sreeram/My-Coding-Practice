/*weakend hack
Write a program to get the love index of couple. The index is calculated by cancelling out the common letters in the names, then summing up the remaining letters for each name and then dividing the small character sum with the bigger character sum. And finally multiplying the result with hundred. Note that both small and capital letters will have the same weightage, so 'M' and 'm' have a score of 13.

Input (Char Array, Char Array)	Output (Double)
{L, a, i, l, a}, {M, a, j, n, u}	L + i + l + a = 12 + 9 + 12 + 1 = 34
                                                           M + j + n + u = 13 + 10 + 14 + 21 = 58
Index = ( 34 / 58 ) * 100 = 58.62069*/
public class MeritD2
{
   public static void main(String args[])
    {
char p1[]={'S','a','r','i','t','h','a'};
char p2[]={'A','j','a','y'};
int i,j,k,sum1,sum2;
//char p1[]={'R','o','m','e','o'};
//char p2[]={'J','u','l','i','e','t'};
String p3,p4;
p1[0]=(char)(p1[0]+32);
p2[0]=(char)(p2[0]+32);
p3="";p4="";sum1=0;sum2=0;
for(i=0;i<p1.length;i++)
{
int count=0;
for(j=0;j<p3.length();j++)
{if(p1[i]==p3.charAt(j))
count++;}
if(count==0)
p3=p3+p1[i];
}

for(i=0;i<p2.length;i++)
{
int count=0;
for(j=0;j<p4.length();j++)
{if(p2[i]==p4.charAt(j))
count++;}
if(count==0)
p4=p4+p2[i];
}

System.out.println("p3:"+p3);
System.out.println("p4:"+p4);
for(i=0;i<p1.length;i++)
sum1+=((int)p1[i]-96);
for(i=0;i<p2.length;i++)
sum2+=((int)p2[i]-96);
System.out.println("sum1:"+sum1);
System.out.println("sum2:"+sum2);

int c1,c2,c;
for(i=0;i<p3.length();i++)
{
c1=0;c2=0;c=0;
	for(j=0;j<p4.length();j++)
	{
	if(p3.charAt(i)==p4.charAt(j))
	{
	      c++;
		for(k=0;k<p1.length;k++)
		{if(p3.charAt(i)==p1[k])
		  ++c1;}
	                  for(k=0;k<p2.length;k++)
		{if(p3.charAt(i)==p2[k])
		++c2;}
                     }
	}
	if(c>0)
	{
                    if(c1>c2)
	    { sum1=sum1-((int)p3.charAt(i)-96)*c2; sum2=sum2-((int)p3.charAt(i)-96)*c2;}
	else
	     {sum1=sum1-((int)p3.charAt(i)-96)*c1;sum2=sum2-((int)p3.charAt(i)-96)*c1;}
	}	
}
System.out.println("sum1(af):"+sum1);
             

System.out.println("sum2(af):"+sum2);

double d=((double)sum1/sum2)*100;
System.out.println(d);

}
}