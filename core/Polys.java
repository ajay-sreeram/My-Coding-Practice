import java.io.*;
public class Polys
{
/*void dis(short t)
{
System.out.println("it is short man");
}
void dis(int i)
{
System.out.println("its int man");
}
void dis(byte t)
{
System.out.println("it is Byte man");
}
void dis(long l)
{
System.out.println("it is Long man");
}*/

void dis(float f)
{
System.out.println("it is Float man");
}
void dis(double t)
{
System.out.println("it is Double man");
}
public static void main(String args[])
{
Polys p=new Polys();
p.dis((byte)1);
}
}

/*in static polymorphism more priority is given to sub type and then to 32/64 bit*/
/*ooooh its really fentastic dude:if byte type is sent it will first refer to byte if not then will refer to next small type i.e short and then int->long->float->double*/ 