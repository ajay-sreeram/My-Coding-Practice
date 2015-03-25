interface Count {
    short counter = 0;
    void countUp();
}
public class History implements Count {
    public static void main(String[] args) {
        History t = new History();
        t.countUp();
    }
    public void countUp() {
        for (int x = 6; x > counter; x--, ++counter) {
            System.out.print(counter + " ");
        }
    }
}