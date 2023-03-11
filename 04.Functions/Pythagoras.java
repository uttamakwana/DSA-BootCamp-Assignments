public class Pythagoras {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        pythagoras(a, b, c);
    }

    static void pythagoras(int a, int b, int c) {
        if (c * c == (a * a + b * b)) {
            System.out.println("Follows Pythagoras");
        } else {
            System.out.println("Not Follows!");
        }
    }
}
