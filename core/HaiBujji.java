public class HaiBujji implements Runnable {
    private int x;
    private int y;
    public static void main(String[] args) {
        HaiBujji that = new HaiBujji();
        (new Thread(that)).start();
        (new Thread(that)).start();
    }
    public synchronized void run() {
        for (int i = 0; i < 3; i++) {
            x++;
            y++;
            System.out.print(x + " " + y + ", ");
        }
    }    
}