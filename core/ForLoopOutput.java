class ForLoopOutput {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i += 2) {
            method(i);
            System.out.print(i);
        }
    }

    private static void method(int i) {
        for (int j = 0; j < i; j++, i--) {
            System.out.print(" " + i + "~" + j + " ");
        }
    }
}