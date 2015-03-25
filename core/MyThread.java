class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();
    }
    public void run() {
        for (int i = 1; i < 7; ++i) {
            System.out.print(i + "..");
        }
    }
}