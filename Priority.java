import java.io.*;
class Clicker implements Runnable
{
long click=0;
Thread t;
private volatile boolean running=true;
public Clicker(int p)
{
t=new Thread(this);
t.setPriority(p);
}
public void run()
{
while(running)
click++;
}
public void stop()
{
running=false;
}
public void start()
{
t.start();
}
}
class Priority 
{
public static void main(String args[])throws IOException
{
//Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
Clicker hi=new Clicker(Thread.MAX_PRIORITY);
Clicker lo=new Clicker(Thread.MIN_PRIORITY);
hi.start();
lo.start();
try{
Thread.sleep(10);
}
catch(InterruptedException e)
{}
hi.stop();lo.stop();
try
{
hi.t.join();
lo.t.join();
}
catch(InterruptedException e)
{}
System.out.println("Low Priority Thread:"+lo.click);
System.out.println("High Priority Thread:"+hi.click);
}
}