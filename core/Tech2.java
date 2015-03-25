import java.io.*;
public class Tech2 
{ 
public static void main(String  args[])
{
System.out.println(smallest_number(2345));
}
    public static int smallest_number(int input1)
    {
      int d1,d2,n1=0,n2=0;
      int temp=1;
      int sum=0;
      int pro=1;
      int num=input1;
      while(num>9)
      {
//System.out.println("num:"+sum);
      while(num>0)
      {
      temp=num%10;
      num=num/10;
      sum+=temp;
      }
      n2++;
num=sum;
sum=0;
      }
      d2=num;
      num=input1;
      while(num>9)
      {
      while(num>0)
      {
      temp=num%10;
      num=num/10;
      pro*=temp;
      }
      n1++;
      num=pro;
pro=1;      
}
      d1=num;
      //d1,n1,d2,n2;
System.out.println("n1:"+n1+" d1:"+d1+" n2:"+n2+" d2:"+d2);      
int result=0;
sum=0;pro=1;
      int tn1,tn2,td1,td2;
      for(int i=num+1;i<2360;i++)
      {
    tn1=0;tn2=0;
      num=i;
  
 while(num>9)
      {
//System.out.println("num:"+sum);
      while(num>0)
      {
      temp=num%10;
      num=num/10;
      sum+=temp;
      }
      tn2++;
num=sum;
sum=0;
      }
      td2=num;
      num=i;
      while(num>9)
      {
      while(num>0)
      {
      temp=num%10;
      num=num/10;
      pro*=temp;
      }
      tn1++;
      num=pro;
pro=1;      
}
      td1=num;
  


System.out.println("i:"+i);
System.out.println(" tn1:"+tn1+"td1:"+td1+" tn2:"+tn2+" td2:"+td2);  
    if(td1==d1&&td2==d2)
      if(tn1<=n1&&tn2<=n2)
      {result=i;}
      }
   if(result==0)
   return -1;
   else
   return result;
   
    }
    
}