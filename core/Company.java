public class Company
{
public static void main(String args[])
{
SW.NI nif=new Project();
if(nif.isNN(10))
System.out.println("10 is not negative");
if(nif.isNN(-12))
System.out.println("this won't be displayed");
}
}
class SW
{
 public interface NI
{
boolean isNN(int x);
}
}

class Project implements SW.NI
{
public boolean isNN(int x)
{
return x<0?false:true;
}
}