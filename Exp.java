public class Exp{
public static void main(String args[]){
       double exp=15.7777;
       exp=exp*1000;
       long temp=Math.round(exp);
       exp =(double)temp/1000;
String str = String.format("%.3f", exp );
       System.out.println(str);
       
}
}