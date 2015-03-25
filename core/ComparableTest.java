import java.util.*;

public class ComparableTest {
    public static void main(String[] args) {
        List<A> list = new ArrayList<A>();
        list.add(new A(5, 7));
        list.add(new A(3, 7));
        list.add(new A(5, 10));
        list.add(new A(10, 3));
        list.add(new A(5, 4));
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}

class A implements Comparable<A> {
    int i, j;
    public A(int i, int j) { this.i = i; this.j = j; }
    public int compareTo(A o) {
        if (i != o.i) return o.i - i;
        return o.j - j;
    }
    public String toString() { return "[" + i + ":" + j + "]"; }
}