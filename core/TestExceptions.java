class AEx extends Exception
{
}

class BEx extends AEx
{
}

class CEx extends BEx
{
}

class TestExceptions
{
    public static void main(String s[]) throws AEx
    {
        try
        {
            System.out.println("Before A");
            methodA(true);
        }
        catch(AEx ax)
        {
            System.out.println("Exception A Occured");
        }

        try
        {
            System.out.println("Before B");
            methodB(false);
        }
        catch(BEx bx)
        {
            System.out.println("Exception B Occured");
        }

        try
        {
            System.out.println("Before C");
            methodC(true);
            System.out.println("After C");
        }
        catch(CEx cx)
        {
            System.out.println("Exception C Occured");
        }

    }

    public static void methodA(boolean value) throws AEx
    {
        if(value) throw new AEx();
    }

    public static void methodB(boolean value) throws AEx
    {
        if(value) throw new BEx();
    }

    public static void methodC(boolean value) throws AEx
    {
        if(value) throw new CEx();
    }
}