public class Random
{
public static void main(String args[])
{
String arr[]=new String[60];
int i,j;
for(i=0;i<100;i++)
{
String temp="";
for(j=0;j<15;j++)
temp+=""+(int)(Math.random()*100%10);
System.out.println(temp);

}
}
}