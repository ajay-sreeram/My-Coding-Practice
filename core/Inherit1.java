class A1
{
 protected int aj()
{
System.out.println("aj of A1");
return 21;
}
}
class A2 extends A1
{
 int aj()
{
System.out.println("aj of A2");
return 12;
}
}
public class Inherit1
{
public static void main(String args[])
{
A2 ob=new A2();
float f=ob.aj();
}
}