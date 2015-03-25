class PrintClassName {
    public static void main(String[] args) {
        print(new U());
        print(new V());
        print((U)new V());
        print(new Z());
        print((U)new Z());
        print((Y)new Z());
        print((W)new X());
    }

    public static void print(Object o) {
        System.out.print((o instanceof U) ? "U" : "");
        System.out.print((o instanceof V) ? "V" : "");
        System.out.print((o instanceof W) ? "W" : "");
        System.out.print((o instanceof X) ? "X" : "");
        System.out.print((o instanceof Y) ? "Y" : "");
        System.out.print((o instanceof Z) ? "Z" : "");
        System.out.print(" ");
    }
}

class U {}
class V extends U {}
interface W {}
class X extends V implements W {}
interface Y extends W {}
class Z extends U implements Y {}