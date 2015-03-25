class AEx extends Exception
{}
class BEx extends AEx
{}
class CEx extends BEx
{}
class TE
{
public static void main(String s[])
{
try
{
System.out.println("Bef a");
methoda(false);
System.out.println("Bef b");
methodb(true);
System.out.println("Bef c");
methodc(false);
}
catch(AEx ax)
{
System.out.println("Exception a ");
}
catch(BEx bx)
{
System.out.println("Exception b ");
}
}

public static void methoda(boolean v) throws AEx
{
if(v) throw new AEx();
}
public static void methodb(boolean v) throws AEx
{
if(v) throw new BEx();
}
public static void methodc(boolean v) throws AEx
{
if(v) throw new CEx();
}
}