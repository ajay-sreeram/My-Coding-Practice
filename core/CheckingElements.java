import java.util.*;

public class CheckingElements 
{
    public static void main(String args[])
    {
        Vector<String> vector = new Vector<String>();

        String test = "A";
        vector.add("65");
        vector.add("66");
        vector.add("67");
        vector.add("69");
        vector.add("51");
        
        List<String> list = new ArrayList<String>();
        list.add("66");
        list.add("67");
        int j = (int) test.charAt(0);
        System.out.println("Vector contains all list elements: " + vector.containsAll(list));

        list.add(Integer.toString(j));
        System.out.println("Vector contains all list elements: " + vector.containsAll(list));
    }
}