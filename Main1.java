public class Main1
{
public static void main (String[] args) throws java.lang.Exception
{
java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
long n1,i,n;
i=Integer.parseInt(r.readLine());
for(n1=0;n1<=i;n1++)
{
n=n1;
if(n%3==0)
{System.out.print(" "+n1+":yes");continue;}
n--;
if(n%3==0)
if(((n/3)%2)==0)
{System.out.print(" "+n1+":yes");continue;}
System.out.print(" "+n1+":no");
}

}
}
