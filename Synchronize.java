import java.io.*;
class Hai
{
String k;
public void disp(String msg)
{
k=msg;
System.out.println("{");
try{
Thread.sleep(1000);
}
catch(InterruptedException e){}
System.out.println(k+"}");
}
}
class Syn implements Runnable
{ 
Hai t;
Syn(String s,Hai l)
{
t=l;
Thread k=new Thread(this,s);
k.start();
}
public void run()
{
Thread aj;
aj=Thread.currentThread();
t.disp(aj.getName());
}
}

class Synchronize
{
public static void main(String s[])
{
Hai p=new Hai();
Syn ob1=new Syn("HELLO",p);
Syn ob2=new Syn("Mr",p);
Syn ob3=new Syn("Sreeram",p);
Syn ob4=new Syn("AJAY",p);
}
}


