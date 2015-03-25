public class Pra
{
  public static void main(String args[])
 {
    int var=107;
    label:
     {
	++var;
	if(var==108)
	break label;
      }
	System.out.println(var);
  }
} 