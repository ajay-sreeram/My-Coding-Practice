class Count
{
int count;
Count()
{
count=0;
}
public Count ret()
{
return this;
}
}
class A
{
void m1(Count c)
{
++c.count;
System.out.println("in m1 of A:"+c.count);
}
void m2(Count c)
{
++c.count;
System.out.println("in m2 of A:"+c.count);
}
}
class B extends A
{
void m3(Count c)
{
++c.count;
System.out.println("in m3 of B:"+c.count);
}
void m4(Count c)
{
++c.count;
System.out.println("in m4 of B:"+c.count);
}
}
class C extends B
{
void m2(Count c)
{
++c.count;
System.out.println("in m2 of C:"+c.count);
}
void m4(Count c)
{
++c.count;
System.out.println("in m4 of C:"+c.count);
}
}
public class D extends C
{
void m1(Count c)
{
++c.count;
System.out.println("in m1 of D:"+c.count);
}
void m4(Count c)
{
++c.count;
System.out.println("in m4 of D:"+c.count);
}
void m5(Count c)
{
++c.count;
System.out.println("in m5 of D:"+c.count);
}
public static void main(String args[])
{
C d=new D();
Count cn=new Count();
d.m1(cn);
d.m2(cn);
d.m3(cn);
d.m4(cn);
d.m5(cn);
//d.m6(cn);
}
}


