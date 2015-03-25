import java.lang.*;
import java.io.*;
class Student
{
int sno,mar;
String name;
public void in()
{
sno=100;
name="AJAY";mar=100;
}
public void out()
{
System.out.println("no is:"+sno);
System.out.println("name is:"+name);
System.out.println("Marks are:"+mar);
}
public String toString()
{
return "no is:"+sno+"name is:"+name+"Marks are:"+mar;
}
}
class Throwable  
{
void Throwable()
{
System.out.println("This is Student1 class");
}
}
class StudentEx
{
public static void main(String ar[])throws IOException
{
try{
Student s=new Student();
s.in();
//s.out();
System.out.println("data is:"+s);
//String x=s;
int q[]=new int[2];
Throwable  p=new Throwable();
p.Throwable();
q[4]=2;
String y=s.toString();
Student x=s;
System.out.println("x="+x);
System.out.println("y="+y);
}
catch(Throwable e)
{
System.out.println("Exception andi idhi:");
}
}
}