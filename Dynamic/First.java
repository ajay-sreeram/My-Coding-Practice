public class First
{
public static double memo[];
public static void main(String args[])
{
 int n = 4;
 memo=new double[n+1];
 int i;
 for(i=0;i<n+1;i++)
 memo[i]=-1;
 int result = getminsteps(n);
 System.out.println(result);
}
public static int getminsteps(int n)
{
 if(n==1)
  return 0;
 if(memo[n]!=-1)
   return (int)memo[n];
 int r = 1 + getminsteps(n-1);
 int temp;
 if(n%2 == 0)
  {
  temp = 1 + getminsteps(n/2);
  r = r < temp ?  r : temp;
  }
 if(n%3 == 0)
  {
  temp = 1 + getminsteps(n/3);
  r = r < temp ?  r : temp;
  }
 memo[n] = r;
 return r;
}
}
