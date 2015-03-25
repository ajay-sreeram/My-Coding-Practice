public class StrangeNum{
public static void main(String args[]){
int i=100;
for(i=100;i<1000;i++)
if(check(i)==1)
System.out.print(" "+i);
}

public static int check(int n){
         if(n-10<0)
            return 1;
         if(n%new String(""+n).length()==0)
            return check(n/new String(""+n).length());
        return 0;
     }
}