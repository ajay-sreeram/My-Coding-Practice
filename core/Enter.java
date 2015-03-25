public class Enter {
    public static void main(String[] args) {
        class Horse {
            public String name;
            public Horse(String s) {
                name = s;
            }
        }
        Object obj = new Horse("Hai hello good day");
        Horse h = (Horse) obj;
        System.out.println(h.name);
    }
}