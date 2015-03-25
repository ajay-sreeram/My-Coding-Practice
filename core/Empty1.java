import java.util.*;
public class Empty1 
{
    public static void main(String args[])
    {
int out=-15;
for(int i=5;i<7;i++)
{
for(int j=8;j>=6;j--)
{
if(i==j)break;
if(i>j)out+=main(i,j);
else
out+=main(j,i);
        }
}
System.out.println("out="+out);
}
private static int main(int a,int b)
{
if(a-b==0)
return 2;
return a-main(a-1,b);
}
}