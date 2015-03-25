public class WaitAndNotify extends Thread {

    public static void main(String[] args) {
        WaitAndNotify wan = new WaitAndNotify();
        print("A"); wan.start();
        print("B"); wan.doWait(20000);
        print("C"); wan.doWait(1);
        print("D"); wan.doWait(50000);
        print("E");
    }

    public void doWait(long l) {
        synchronized (this) {
            try { wait(l); } catch (Exception e) { print("X"); }
        }
    }

    public void doNotify() { synchronized (this) { notify(); } }
    public void doNotifyAll() { synchronized (this) { notifyAll(); } }
    public static void print(String s) { System.out.print(s + " - "); }

    public void run() {
        try {
            Thread.sleep(5000);
            print("M"); doNotify();
            Thread.sleep(2000);
            print("N"); doNotifyAll();
        } catch (Exception e) { print("Y"); }
    }
}