class A
{
void m1()
{
System.out.println("in m1 of A");
}
void m2()
{
System.out.println("in m2 of A");
}
}
class B
{
void m3()
{
System.out.println("in m3 of B");
}
void m4()
{
System.out.println("in m4 of B");
}
}
class C
{
void m2()
{
System.out.println("in m2 of C");
}
void m4()
{
System.out.println("in m4 of C");
}
}
public class D
{
void m1()
{
System.out.println("in m1 of D");
}
void m5()
{
System.out.println("in m5 of D");
}
public static void main(String args[])
{
D d=new D();
d.m1();
d.m2();
d.m3();
d.m4();
d.m5();
//d.m6();
}
}


