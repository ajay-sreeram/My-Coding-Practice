import java.util.*;

public class MatchNumbers {

    public static void main(String[] args) {
        List<Double> one = getAsList(25.56, 36.21, 16.00, 29.98, 31.7, 54.1, 32.2, 90.0);
        List<Double> two = getAsList(24.9, 76.0, 45.0, 55.9);
        System.out.println(matchNumbers(one, two));
    }

    public static List getAsList(Double... doubles) {
        List result = new ArrayList();
        for (Double d : doubles) { result.add(d); }
        return result;
    }

    private static Map<Double, Double> matchNumbers(List<Double> one, List<Double> two) {
        Map<Double, Double> result = new HashMap<Double, Double>();
        Collections.sort(one); Collections.sort(two); Collections.reverse(two);
        for (Double d2 : two) {
            for (Double d1 : one) {
                if (d1 < d2) {
                    result.put(d2, d1);
                }
            }
        }
        return result;
    }
}