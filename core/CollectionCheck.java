import java.util.*;

public class CollectionCheck 
{
    public static void main(String args[])
    {
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        Collection checkedList = Collections.checkedCollection(list, String.class);
        System.out.println("Checked list: " + checkedList);

        list.add(10);    //LINE K
        checkedList.add(10);    //LINE G
    }
}