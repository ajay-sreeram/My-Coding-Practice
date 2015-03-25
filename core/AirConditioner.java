interface Fan {
    short counter = 0;
    void countUp(int k);
}
public class AirConditioner implements Fan {
    public static void main(String[] args) {
        AirConditioner t = new AirConditioner();
        t.countUp(counter);
    }
    public void countUp(int k) {
        for (int x = 6; x > k; x--, ++k) {
            System.out.print(k + " ");
        }
    }
}