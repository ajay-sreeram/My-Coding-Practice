import java.util.Scanner;
 
public class Factor {
    public static void main(String[] args) {
        System.out.print("Enter a positive number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        int count;
        int result=1;
		for (int i = 2; i<=(number); i++) {
			count=0;
            while (number % i == 0) {
                number /= i;
                count++;
            }
			if (count == 0)
				continue;
            result*=(count+1);
			//System.out.println(i+ "**" + count);
        }
		System.out.println("RESULT:"+result);
    }
}