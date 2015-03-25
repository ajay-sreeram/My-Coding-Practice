import java.io.*;
class Fir
{
/*public String toString()
{
return "this is to String method";
}*/
}
public class Polys2
{
void dis(String s)
{
System.out.println("in String ");
}void dis(int p)
{
System.out.println("int int");
}
public static void main(String args[])
{
Fir f=new Fir();
Polys2 p=new Polys2();
//p.dis(f);
System.out.println(f);
System.out.println("Hashcode:"+f.hashCode());
System.out.println("String:"+f.toString());
}
}
/*we will get error in this case because when ever we try to prin object(reference variable)*/