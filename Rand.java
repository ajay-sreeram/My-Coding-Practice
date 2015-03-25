public class Rand
{
public static void main(String args[])
{
String arr[]={"a","b","a","c","b","a","c"};
int i,j;
for(i=0;i<arr.length;i++)
for(j=0;j<arr.length;j++)
if(arr[i].compareTo(arr[j])<0)
{String temp=arr[i];arr[i]=arr[j];arr[j]=temp;}
for(i=0;i<arr.length;i++)
System.out.print("    "+arr[i]);

int count=0;
for(i=0,j=i+1;j<arr.length;i=j)
{
count++;
while(j<arr.length&&arr[i].equals(arr[j]))
j++;
}
System.out.println(count);


}

}










/*
String st="aaab";
int i,j,k;
int n=0;
for(i=1;i<=st.length();i++)
for(j=0,k=i;k<=st.length();j++,k++)
{System.out.println(st.substring(j,k));n++;}
System.out.println("NN:"+n);
String arr[]=new String[n];
int p=0;
for(i=1,p=0;i<=st.length();i++)
for(j=0,k=i;k<=st.length();j++,k++)
{arr[p]=st.substring(j,k);p++;}

int count=0;
int result=0;
for(i=0;i<n;i++)
{
for(j=0;j<n&&i<n;j++)
//if(i!=j)
if(arr[i].equals(arr[j]))
{
System.out.println(arr[i]);
count++;
}
count/=2;
}

//count++;
System.out.println("REsult:"+(n-count));

*/


/*
String st="abcd";
int i=3;
String temp=st.substring(0,i-1)+"q"+st.substring(i,st.length());
System.out.println("RESULT:"+temp);
*/