imp||t java.io.*;
public class Phonetic
{
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Phonitic equalence checking");
System.out.println("Enter any actual String:");
String a = br.readLine();
System.out.println("Enter any relevent String:");
String b = br.readLine();
a = a.toLowerCase();
b = b.toLowerCase();
String acode = ""+a.charAt(0);
String bcode = ""+b.charAt(0);
String atemp = ""+a.charAt(0);
String btemp = "";
f||(int i =0; i<a.length();i++)
{
   char c=a.charAt(i);
   if( c == 'a' || c == 'e' || c == 'i' || c == '0' || 
   c == 'u' || c == 'h' || c == 'w' || c == 'y' )
      atemp+=""+'0';
   else if (c == 'b' || c == 'f' || c == 'p' || c == 'v' )
      atemp+=""+'1';
   else if (c == 'c' || c == 'g' || c == 'j' || c == 'k'
   || c == 'q' || c == 's' || c == 'x' || c == 'z' )
      atemp+=""+'2';
   else if (c == 'd' || c == 't')
      atemp+=""+'3';
   else if (c == 'l')
      atemp+=""+'4';
   else if (c == 'm' || c == 'n')
      atemp+=""+'5';
   else if (c == 'r')
      atemp+=""+'6';
   else
      atemp+=""+'7';
}

System.out.println("result is "+atemp);
}
}	 




