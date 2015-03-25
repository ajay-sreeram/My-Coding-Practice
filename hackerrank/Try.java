import java.util.*;
public class Try{
public static void main(String args[])
{
List al=new ArrayList();
StringBuilder st=new StringBuilder("A");
al.add(st);
st=new StringBuilder("B");
al.add("B");
st=new StringBuilder("A");
if(al.contains(st.toString()))
System.out.println("TRUE");
else
System.out.println("FALSE");
}
}