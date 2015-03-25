import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutions2 {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,t,i,j,a[];
        String result[];
        t = in.nextInt();
        result=new String[t];
      for(j=0;j<t;j++)
      {
        n=in.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
	a[i]=in.nextInt();
         result[j]=check(a);
      }
       for(i=0;i<t;i++)
        System.out.println(result[i]);
   }
public static String check(int a[])
{
int i,j,k;
for(i=0;i<a.length;i++)
 for(j=i+1;j<a.length;j++)
  {
    if(a[i]>a[j])
     {
        for(k=2;k<=a[j];k++)
	if(a[i]%k==0 && a[j]%k==0)
                 return "NO";
     }
     else
     {
        for(k=2;k<=a[i];k++)
	if(a[i]%k==0 && a[j]%k==0)
                 return "NO";
        
     }
  }
return "YES";
}
}