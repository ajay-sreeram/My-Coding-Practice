public class Arithmetic {
    private static int y;
    public static void main(String... s) {
        try {
            int x = 0;
            y = 5 / x;
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("finished");
    }
}