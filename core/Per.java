import java.util.*;
class Per
{
public static void main(String args[])
{
permutation("abc");
}
public static void permutation(String str) { 
List<String> list=new ArrayList<String>();

    permutation("", str,list); 
System.out.println(list);

}

public static void permutation(String prefix, String str,List<String> list) {
    int n = str.length();
    if (n == 0) 
list.add(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),list);
    }
}
}