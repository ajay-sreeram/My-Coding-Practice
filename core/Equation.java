public class Equation {
    public static void main(String args[]) {
        int t = 1;
        String s = "2";
        int N, A, B, C, sum;
        for (int i = 0; i < t; i++) {
            N = A = B = C = Integer.parseInt(s);
            A++;    B++;    C++;
            sum = (int) (get(N) + get(N - A - B) + get(N - B - C) + get(N - A - C) - get(N - A));
            System.out.println("Sum = " + sum);
        }
    }
    public static long get(long n) {
        if (n < 0)
            return 0;
        return ((n + 3) * (n + 2) * (n + 1)) / 6;
    }
}