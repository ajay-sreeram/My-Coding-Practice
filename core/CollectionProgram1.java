import java.util.*;
public class CollectionProgram1 
{
    public static void main(String args[])
    {
        List<String> list = new ArrayList<String>();
        java.util.ListIterator<String> listIterator = null;
        list.add("Merit ");
        list.add("Campus ");
        list.add("welcomes ");
        list.add("you ");
        list.add("to ");
        list.add("become ");
        list.add("a ");
        list.add("good ");
        list.add("programmer.");

        listIterator = list.listIterator();

        while(listIterator.hasNext())
        {
            System.out.print(listIterator.next());
        }
    }
}
