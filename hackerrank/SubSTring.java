import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubSTring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String st=in.nextLine();
        st=in.nextLine();
        int arr[]=new int[26];
        for(int i=0;i<st.length();i++){
			System.out.println((int)st.charAt(i));
         //   arr[(97-(int)st.charAt(i))]++;
        }
        long res=0;
        for(int i=0;i<arr.length;i++)
                res=res+((long)arr[i]*(arr[i]+1)/2);
        System.out.println(res);
    }
}