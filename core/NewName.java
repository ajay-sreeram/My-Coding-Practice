public class NewName extends Thread {
    public void run() {
        System.out.println("Starting point");
        yield();
        System.out.println("Ending point");
    }
    public static void main(String[] argv) {
        (new NewName()).start();
    }
}