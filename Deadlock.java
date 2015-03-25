class A
{
synchronized void foo(B b)
{
String name=Thread.currentThread().getName();
System.out.println(name+"Entered A.foo():");
try
{
Thread.sleep(5000);
}
catch(InterruptedException e){System.out.println("A interrupted");}
System.out.println(name+"trying to call B.last()");
}
synchronized void last()
{
System.out.println("Inside A.last()");
}
}
class B
{
synchronized void bar(A a)
{
String name=Thread.currentThread().getName();
System.out.println(name+"Entered B.bar():");
try
{
Thread.sleep(5000);
}
catch(InterruptedException e){System.out.println("A interrupted");}
System.out.println(name+"trying to call A.last()");
}
synchronized void last()
{
System.out.println("Inside B.last()");
}
}

public class Deadlock implements Runnable
{
A a=new A();
B b=new B();
Deadlock()
{
Thread.currentThread().setName("MainThread");
Thread t=new Thread(this,"Racing Thread");
t.start();
a.foo(b);
System.out.println("Back in main thread");
}
public void run()
{
b.bar(a);
System.out.println("Back in Racing Thread");
}
public static void main(String args[])
{
new Deadlock();
}
}