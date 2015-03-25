import java.applet.*;
import java.io.*;

class apple extends Thread
{
apple(String st)
{
this.setName(st);
this.start();
}
public void run()
{
for(int i=10;i>0;i--)
System.out.println("Name is:1  "+this.getName());
}
}
class Multi
{
public static void main(String arg[])
{
apple a=new apple("apple");
apple b=new apple("Orange");
System.out.println("HAI MAIN THREAD");
}
}
