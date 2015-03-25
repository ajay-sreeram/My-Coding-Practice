class Base{
public String name="BASE";
}

class Derived extends Base{
private final String name="Derived";
public String getname()
{
return name;
}
}

public class Details{
public static void main(String args[])
{
System.out.println(new Derived().getname());
System.out.println(new Derived().name);
}
}