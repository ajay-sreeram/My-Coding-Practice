class Arg {
public static void main(String... args) {
doIt(1);
doIt(1,2);
}
static void doIt(int... params) {System.out.println("in method"); }
}