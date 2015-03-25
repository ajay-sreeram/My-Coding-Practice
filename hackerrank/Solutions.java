import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutions {
static int arr[];
static int min=0;
static int check=0;
static int n[]; 
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        arr=new int[60];        
        n=new int[t];
       for(int i=0;i<t;i++)
         n[i] = in.nextInt();   
       for(int i=0;i<t;i++)
         System.out.println(fun(n[i]));
   }

public static int fun(int n)
{
if(arr[n]!=0)
return arr[n];
if(min==0)
{arr[min]=1;}
//System.out.println("arr[min]:"+arr[min]);
for(++min;min<=n;min++)
if(check==0)
{
check=1;
arr[min]=arr[min-1]*2;
//System.out.println("arr["+min+"]:"+arr[min]);
}
else
{
check=0;
arr[min]=arr[min-1]+1;
//System.out.println("arr["+min+"]:"+arr[min]);
}
return arr[--min];
}
}