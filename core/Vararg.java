public class Vararg
{
void dis(int... i)
{
for(int p:i)
System.out.println("in var method"+p);
}
public static void main(String args[])
{
Vararg v=new Vararg();
v.dis(10);
v.dis(10,20);
v.dis(10,20,30);
}
}
