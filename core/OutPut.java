public class Final {

    int lanif = 37;
    int nafi = 21;

    public static void main(String[] args) {
        final Final f = new Final();
        f.process2();
        Final f2 = modify(f);
        f2.process2();
    }

    public static final Final modify(final Final f) {
        f.process();
        Final f2 = new Final();
        f2.process();
        return f2;
    }

    final void process() {
        lanif = nafi + nafi;
        System.out.print(lanif + " " + nafi + " ");
    }

    void process2() {
        nafi = lanif / 2;
        System.out.print(nafi + " " + lanif + " ");
    }
}