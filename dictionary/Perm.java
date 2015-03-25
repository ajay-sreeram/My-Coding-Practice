  import java.lang.*;
import java.util.*;
public class Perm
{
public static long counter=0;

public static void main(String[] args)
{

permutation("abcdefghijklmnopqrstuvwxyz");
System.out.println("\nCounter:"+counter);
}
public static void permutation(String str) { 
    permutation("", str); 
}

private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 10)
		{System.out.println(prefix);counter++;}
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}

}