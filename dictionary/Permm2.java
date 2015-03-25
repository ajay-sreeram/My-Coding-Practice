  import java.lang.*;
import java.io.*;
  import java.util.*;
public class Permm2
{
public static long counter=0;
public static FileOutputStream fs;
public static DataOutputStream ds;
public static String stfile;
public static void main(String[] args)throws IOException
{
fs=new FileOutputStream("boxes.txt");
ds=new DataOutputStream(fs);
		stfile="";
permutation("etaiosrnhlcdupmgywfbvkjxqzrnhlcdetaiosetaiosrnhlcdupmgyetaios");
fs.close();
System.out.println("\nCounter:"+counter);
}
public static void permutation(String str)throws IOException { 
    permutation("", str); 
}

private static void permutation(String prefix, String str)throws IOException 
{
    int n = str.length();
    if (n == 45)
		{
		System.out.println(prefix);
		ds.writeBytes(prefix+"\n");
		counter++;
		}
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}

}