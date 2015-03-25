import java.util.Scanner;
public class TriangleLab {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(); 
        double s = .5 * (a + b + c);
        int area = (int) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        int x = ((area * 9) + 1);
        System.out.print(area + " - " + x);
    }
}