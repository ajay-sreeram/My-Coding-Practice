import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
public class Solution5
{
 public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n = s.nextInt();
       String fact = factorial(n);
       System.out.println("Factorial is " + fact);
   }

   public static String factorial(int n) {
       BigInteger fact = new BigInteger("1");
       for (int i = 1; i <= n; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
       return fact.toString();
   }
}



/*
public static void main(String args[])throws IOException
    {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
n=Integer.parseInt(br.readLine());
double l;
l=fact(n);
System.out.println("NUMBER:"+l);
}
public static double fact(int n)
{
double logFactorial = 0;
for (int i = 2; i <= n; i++) {
  logFactorial += Math.log(i);
}
return logFactorial;
}
*/