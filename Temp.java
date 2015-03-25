public class Temp
{
public static void main(String args[])
{
String sarrt[]={"4#11","6#0","5#2","6#1","7#1","5#11","5#11","5#10","5#8"};
String sarr[]=sarrt;
String tarr[]=new String[2];
int i,j,x,y;
int p,q;
int parr[]=new int[sarr.length];
for(i=0;i<sarr.length;i++)
{
 tarr=sarr[i].split("#");
 p=Integer.parseInt(tarr[0]);
q=Integer.parseInt(tarr[1]);
if(p<4||p>7)
System.out.println("-1");
if(q<0||q>11)
System.out.println("-1");
parr[i]=p*12+q;
}
int cnt=0;
for(i=0;i<sarr.length;i++)
 for(j=i+1;j<sarr.length;j++)
  if(parr[i]>parr[j])
  cnt++;
System.out.println(cnt);

}
}