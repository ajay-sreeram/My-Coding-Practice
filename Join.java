import java.io.*;

class NewThread implements Runnable
{
Thread t;
int i;String st;
NewThread(String s)
{
st=s;
t=new Thread(this,s);
System.out.println("New Thread:"+s);
//t.start();
}
public void run()
{
for(i=0;i<5;i++)
{
System.out.println(st+i);
try
{
t.sleep(500);
}
catch(InterruptedException e){}
}
}
}
class Join
{
public static void main(String ar[])throws IOException
{
NewThread p1=new NewThread("one");
NewThread p2=new NewThread("two");
NewThread p3=new NewThread("three");
try{
p1.t.start();
//p1.t.join();
p2.t.start();//p2.t.join();
System.out.println("state of one is"+p1.t.isAlive());
System.out.println("state of two is"+p2.t.isAlive());
System.out.println("state of three is"+p3.t.isAlive());
p3.t.start();p3.t.join();
}catch(InterruptedException e){}
System.out.println("state of one is"+p1.t.isAlive());
System.out.println("state of two is"+p2.t.isAlive());
System.out.println("state of three is"+p3.t.isAlive());
System.out.println("Main Thread terminated");
}
}