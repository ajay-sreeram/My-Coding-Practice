import java.util.*;
public class Factors{ 
    public static void main(String args[])throws java.lang.Throwable {
        Scanner in=new Scanner(System.in);
        int t=Integer.parseInt(in.nextLine());
        for(int i=0;i<t;i++){
            System.out.println(factors(Integer.parseInt(in.nextLine())));
        }
    }

   public static int factors(int number){
        int count;
        int result=1;
		count=0;
		while(number%2==0)
		{count++;number/=2;}
		result*=(count+1);
	 for (int i = 3; i<=(int)Math.sqrt(number); i+=2){
            count=0;
            while (number % i == 0) {
                number /= i;
                count++;
            }
            if(count == 0)
                continue;
            result*=(count+1);
        }
		if(number>2)
		result*=2;
        return result;
    }
}