class MethodsTest
{
    public static void main(String s[])
    {
        float m = 34;
        float n = 56;
        double x = 21.0;
        double y = 98.0;
        boolean b = m < n;
        int o = (int) operate(m, n, x, y, b);
        System.out.println("o = " + o);
    }
    
    public static double operate(double d1, double d2, double d3, double d4, boolean d5)
    {
        System.out.println("d1 = " + d1 + " d2 = " + d2);
        System.out.println("d3 = " + d3 + " d4 = " + d4);
        return d5 ? d1 + d2 : d3 - d4;
    }
}