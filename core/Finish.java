interface Common {
    short counter = 0;
    void countUp();
    void countUp(int k);
}
public class Finish implements Common {
    public static void main(String[] args) {
        Finish t = new Finish();
        t.countUp(counter);
    }
    public void countUp(int k) {
        for (int x = 6; x > k; x--, ++k) {
            System.out.print(k + " ");
        }
    }
}