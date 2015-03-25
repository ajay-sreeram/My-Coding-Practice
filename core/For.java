import java.io.*;
class A
{
int i=200;
}
class B
{
int i=300;
}
class C
{
int i=400;
}

public class For
{
public static void main(String args[])
{
Object p[]=new Object[5];
p[0]=new A();
p[1]=new B();
p[2]=new C();
System.out.println(p);
for(Object q:p)
System.out.println(q);
//System.out.println(p[1].i);
}
}
