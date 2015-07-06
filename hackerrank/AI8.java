import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int i,n=Integer.parseInt(in.nextLine());
        String a1[]=new String[n];
        String a2[]=new String[n];
        for(i=0;i<n;i++)
            a1[i]=in.nextLine().trim();
        for(i=0;i<n;i++)
            a2[i]=in.nextLine().trim();
        
		for(i=1;i<=n/2;i++){
            if(check(a1,a2,n,i-1,n-i))
                break;
        }
        
		if(i>n/2)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
    public static boolean check(String a1[],String a2[],int n,int s,int e){
        System.out.println("s:"+s+" e:"+e);
		if(r1(a1,a2,s,e))
            return true;
        if(r2(a1,a2,s,e))
            return true;
        if(r3(a1,a2,s,e))
            return true;
        return false;
    }
    public static boolean r1(String a1[],String a2[],int s,int e){
        for(int i=s;i<=e;i++)
            for(int j=s;j<=e;j++)
                if(a1[i].charAt(j)!=a2[j].charAt(i))
                    return false;
        return true;
    }
    public static boolean r2(String a1[],String a2[],int s,int e){   
        for(int i=s;i<=e;i++)
            for(int j=s;j<=e;j++)
                if(a1[i].charAt(j)!=a2[i].charAt(s+e-j))
                    return false;
        return true;
    }
    public static boolean r3(String a1[],String a2[],int s,int e){
        for(int i=s;i<=e;i++)
            for(int j=s;j<=e;j++)
                if(a1[i].charAt(j)!=a2[s+e-i].charAt(s+e-j))
                    return false;
        return true;
    }
}