import java.io.*;
import java.applet.*;
import java.lang.*;
class First extends Thread
{
First(String st)
{
super(st);
}
public void ramp()
{
int i;
i=0;
for(i=0;i<10;i++)
{
try{
sleep(1000);
}
catch(InterruptedException e)
{}
System.out.println("nenu Child:"+i+":");
}
}
}
class Secon extends Thread
{
First f;
Secon(String st)
{
super(st);
f=new First("Child");
}
public void run()
{
try{
for(int i=0;i<10;i++)
{
/*try{sleep(1000);}
catch(InterruptedException e){sleep(2000);System.out.println("Got Exception Boss");}*/

System.out.println("nena Thoopu ra rey:"+i+":");
f.ramp();
}
}
catch(IllegalThreadStateException e)
{
System.out.println("Got Exception Boss");
}
}
}

class Child
{
public static void main(String s[])
{
/*for(int i=0;i<5;i++)
{
System.out.println(" Main ni :(");
}*/

Secon z=new Secon("Parent");
z.start();

for(int i=0;i<5;i++)
{
System.out.println(" Main ni :(");
}
}
}