class Total {
    int a, b, total;
    static int c;

    Total(int a, int b, int c, int total) {
        this.a = a; this.b = b; this.c = c; this.total = total;
    }

    Total(int a, int b, int c) {
        this(a, b, c, a + b + c);
    }

    Total(int a, int b) {
        this(a, b, c, a + b + c);
    }

    public void print() {
        System.out.println("c = " + c + " total = " + total);
        c = total;
    }

    public static void main(String[] args) {
        Total t1 = new Total(4, 7, 2, 4 + 7 + 2);
        Total t2 = new Total(t1.a, t1.b, t1.c);
        t1.print();
        Total t3 = new Total(t1.c, t2.c);
        t2.print(); t3.print(); t1.print();
    }
}