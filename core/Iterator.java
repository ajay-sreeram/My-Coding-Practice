import java.util.*;
public class Iterator
{
    public static void main(String[] args)
    {
        List<String> strList = new ArrayList<String>();
        strList.add("M");
        strList.add("E");
        strList.add("R");
        strList.add("I");
        strList.add("T");

        for(String obj : strList)
        {
            System.out.print(obj + " ");
        }
    }
}
/*
public class Iterator
{
    public static void main(String[] args)
    {
        List<String> strList = new ArrayList<String>();
        strList.add("M");
        strList.add("E");
        strList.add("R");
        strList.add("I");
        strList.add("T");

        java.util.Iterator<String> it = strList.iterator();
        while(it.hasNext())
        {
            String obj = it.next();
            System.out.print(obj + " ");
        }
    }
}*/