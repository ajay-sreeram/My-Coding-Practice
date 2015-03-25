public class LikeIt {
    public static int x;
    public static int foo(int y) {
        return y * 2;
    }
    public static void main(String[] args) {
        int z = 5;
        assert z > 0; //LINE M
        assert z > 2 : foo(z); //LINE N
        if (z < 7)
            assert z > 4; //LINE O
        switch (z) {
            case 4 :    System.out.println("4 ");
            case 5 :    System.out.println("5 ");
            default :    assert z < 10;
        }
        if (z < 10)
            assert z > 4 : z++; //LINE P
        System.out.println(z);
    }
}