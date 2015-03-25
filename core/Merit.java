class Merit
{
Merit()
{
System.out.print("Merit");
}
public class Campus
{
 Campus()
{
System.out.print("Campus");
}
public void go()
{
System.out.print("to become java programer");
}
}
public static void main(String args[])
{
Merit m=new Merit();
m.mp();
}
void mp()
{
//(new Campus(){}).go();
new Campus().go();
}
}
