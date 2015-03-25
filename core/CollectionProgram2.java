import java.util.*;
public class CollectionProgram2 
{
    public static void main(String a[])
    {
        Vector<String> vector = new Vector<String>();
        Enumeration<String> string = null;
        vector.add("Merit ");
        vector.add("Campus ");
        vector.add("welcomes ");
        vector.add("you ");
        vector.add("to ");
        vector.add("become ");
        vector.add("a ");
        vector.add("good ");
        vector.add("programmer.");

        string = vector.elements();

        while(string.hasMoreElements())
        {
            System.out.print(string.nextElement());
        }
    }
}
