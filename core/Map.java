import java.util.*;
public class Map
{
public static void main(String s[])
    {
        Map<String, String> inputMap = new HashMap<String, String>();
        inputMap.put("key1", "Hai");
        inputMap.put("key2", "7%6$");
        inputMap.put("key3", null);
        inputMap.put("key4", "how");
        inputMap.put("key6", null);
        inputMap.put("key7", "75%");
        inputMap.put("key8", "you");
        inputMap.put("key9", "234");
        inputMap.put("key9", ".");
        System.out.println("The keys are : " + getKeysListWhoseValueIsNull(inputMap));

    }


public static List<String> getKeysListWhoseValueIsNull(Map<String, String> inputMap)
 {
List<String> es=inputMap.entrySet();
//System.out.println(es);
return es;
}
}