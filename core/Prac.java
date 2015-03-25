import java.util.*;
public class Prac
{ 
public static void main(String[] args) 
    {
int a=34;
double d=20.5;
d+=a;
a+=d;
d-=a;
a-=d;
System.out.println("d="+ ++d);
System.out.println("a="+ a--);
   }
}