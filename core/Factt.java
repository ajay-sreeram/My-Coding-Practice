public class Factt{
public static void main(String args[])//throws IOException{
{
long arr[]={1,1,2,6,24,120,720,5040,40320,362880};
int cnt=0;
long l=4294967295L;
for(long i=1;i<=l;i++){
long sum=0;
String st=new String(""+i);
char digits[]=st.toCharArray();
for(int j=0;j<digits.length;j++)
	sum+=arr[Integer.parseInt(""+digits[j])];
if(sum==i)
   {cnt++;System.out.println(i);}
}
System.out.println("count is:"+cnt);
}
}