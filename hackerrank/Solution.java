import java.io.*;
import java.util.*;
public class Solution
{
public static void main(String args[])throws IOException
{
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.nextLine());
String par[]=new String[n];
String obr[]=new String[n];
int i,j,k,cnt,loc;
for(i=0;i<n;i++)
par[i]=sc.nextLine();
//as,of,a,by,the,
for(i=0;i<n;i++)
{
par[i]=par[i].replaceAll("of ","");
par[i]=par[i].replaceAll("a ","");
par[i]=par[i].replaceAll("by ","");
par[i]=par[i].replaceAll("the ","");
par[i]=par[i].replaceAll("as ","");
}
for(i=0;i<n;i++)
obr[i]=sc.nextLine();
String arr[][]=new String[n][];
for(i=0;i<n;i++)
arr[i]=par[i].split(" ");
String st;
for(i=0;i<n;i++)
{
 st=obr[i];
 for(int p=0;p<arr.length;p++)
 { 
   j=0;
    cnt=0;loc=0;
    for(k=0;k<arr[p].length;k++)
     if(arr[p][k].charAt(0)==st.charAt(j))
      {
         if(j==0)
          loc=k;
         j++; 
        if(k-loc==j-1)
        cnt++;
        if(j==st.length())
        break;
      }
    if(cnt==st.length())
   {
   for(;loc<=k;loc++)
   System.out.print(arr[p][loc].replace(".","")+" ");
   System.out.println();
  }
}
}

}
 }