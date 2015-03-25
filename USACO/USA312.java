import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class USA312
{
public static void main(String args[])
{
int best[]=new int[1000];
int time,classes,length,points;
int a,b;
Scanner in = new Scanner(System.in);
time=in.nextInt();
classes=in.nextInt();
for(a=0;a<classes;a++)
{
 points=in.nextInt();
 length=in.nextInt();
 for(b=length;b<=time;b++)
 {
  if(best[b-length]+points>best[b])
   best[b]=best[b-length]+points;
 }
 for(int i=0;i<=time;i++)
  System.out.print("   b[" + i + "]:" + best[i]);
}
System.out.println("result:"+best[time]);
}
}