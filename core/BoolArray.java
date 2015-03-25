class BoolArray {
    boolean[] bool = new boolean[3];
    int count = 0;
    void set(boolean[] x, int i) {
        x[i] = true;    ++count;
    }
    public static void main(String[] args) {
        BoolArray result = new BoolArray();
        result.set(result.bool, 0);
        result.set(result.bool, 2);
        result.check();
    }
    void check() {
        if (bool[0] && bool[1] | bool[2])
            count++;
        if (bool[1] && bool[(++count - 2)])
            count += 7;
        System.out.println("count = " + count);
    }
}