public class HaiTwice {
    static int num;
    public static void main(String[] args) {
        HaiTwice p = new HaiTwice();
        p.start();
        System.out.println(num);
    }
    void start() {
        int var = 7;
        twice(var);
        System.out.print(var + " ");
    }
    void twice(int var) {
        var = var * 2;
        num = var;
    }
}