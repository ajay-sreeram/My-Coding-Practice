import java.util.*;
import java.net.*;
//import java.text.*;
public class Ex
{
public static void main(String s[])
    {
 long startTime1 = System.currentTimeMillis();

     for(int i = 100000; i > 0; i--)
    {
    }
      long stopTime1 = System.currentTimeMillis();
      long elapsedTime1 = stopTime1 - startTime1;
      
 long startTime2 = System.currentTimeMillis();

    for(int i = 1; i < 100001; i++)
    {
    }
      long stopTime2 = System.currentTimeMillis();
      long elapsedTime2 = stopTime2 - startTime2;
if(elapsedTime1 >elapsedTime2 )
System.out.println("X is big");
if(elapsedTime1 <elapsedTime2 )
System.out.println("Y is big");
if(elapsedTime1 ==elapsedTime2 )
System.out.println("both equal");



   }
}