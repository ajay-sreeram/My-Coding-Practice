import java.util.*;
import java.net.*;
public class B
{
static int i;
static int j;
static
{
i=15;
j=i-5;
}
public static void main(String args[])
    {
int i=0;
A a=null;
for(;i<3;i++)
{
a=new A();
a.i=B.i;
B.i+=a.add(a.operate(i));
}
System.out.println(B.i+" "+B.j+" "+i+" "+a.i);
}
}

class A
{
int i=0;
int operate(int i)
{
if(B.j-i==i*i*i)
return -i;
return i*i;
}
int add(int i)
{
return this.i+i;
}
}
