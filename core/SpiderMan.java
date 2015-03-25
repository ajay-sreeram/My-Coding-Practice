public class SpiderMan implements Runnable {
    int x = 0, y = 0;
    int addX() { x++; return x; }
    int addY() { y++; return y; }
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.print(addX() + " " + addY() + ", ");
    }
    public static void main(String args[]) {
        SpiderMan run1 = new SpiderMan();
        SpiderMan run2 = new SpiderMan();
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        t1.run();
        t2.run();
    }
}