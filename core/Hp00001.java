import java.util.*;
public class Hp00001 {
    public static void main(String[] args) {
        Vector vect = new Vector();
        vect.add("1");    vect.add("2");
        vect.add("3");    vect.add("4");
        vect.add("5");    vect.add("6");
        vect.add("7");    vect.add("8");
        vect.add("9");    vect.add("10");
        vect.add("11");
        Object[] obj = new Object[11];
        vect.copyInto(obj);
        Arrays.sort(obj);
        Collections.reverse(vect);
        for (int index = 0; index < 11; index++)
            if (vect.get(index) != obj[index])
                System.out.print(vect.get(index) + " ");
    }
}