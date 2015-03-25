class Cls{
public int a;
public Cls next;
}
public class Checker{
public static void main(String args[]){
Cls c1=new Cls();
c1.a=21;
c1.next=new Cls();
c1.next.a=31;
fun(c1);
System.out.println(c1.a);
}
public static void fun(Cls c){
Cls c2=c;
c2=c.next;
}
}