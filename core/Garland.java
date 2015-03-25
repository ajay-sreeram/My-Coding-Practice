import java.io.*;
public class Garland
{
public static void main(String ap[])throws IOException
{
int n=ap.length;
System.out.println(""+n);
int i,l=n;
String temp=ap[0];
String aj[]=new String[n];
for(i=0;i<n;i++)
aj[i]="";
int ajl=0;
for(i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i!=j)
{
if(temp.charAt(ap[i].length()-1)==ap[j].charAt(0))
{
int count=0;
for(int k=0;k<n;k++)
if(aj[k].equals(ap[j]))
count++;
if(count!=0)
continue;
aj[ajl]=ap[j];
ajl++;
temp=temp+ap[j].substring(1);
}
}
}
}
System.out.println(""+ap.length);
System.out.println(temp);
}
}