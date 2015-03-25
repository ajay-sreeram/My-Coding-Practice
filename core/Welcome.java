import java.util.*;
public class Welcome {
    public static void main(String[] args) {
        int n = 5, k = 3, count = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);    list.add(18);
        list.add(27);    list.add(34);
        list.add(36);    list.add(49);
        list.add(56);    list.add(60);
        list.add(21);    list.add(45);
        list.add(12);    list.add(99);
        n = list.size();
        for (int i = 0; i < n; i++){
            if (list.get(i) % k == 0 && list.get(i) % (k - 1) != 0)
                count++;
        }
        System.out.println("Count is " + count);
    }
}
