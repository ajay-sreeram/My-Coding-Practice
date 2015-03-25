import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mod{

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int z=0;z<t;z++){
            String arr[]=br.readLine().split(" ");
            String a=arr[0];
            int b=Integer.parseInt(arr[1]);
            int c=Integer.parseInt(arr[2]);
            String st="";
            for(int i=0;i<b;i++){
               st=st+a;
            }
			System.out.println(st);
            int sum=0;
            for(int i=0;i<st.length();i++){
                sum=(sum*10+((int)st.charAt(i)-48))%c;
            }
            System.out.println(sum);
        }
    }
}