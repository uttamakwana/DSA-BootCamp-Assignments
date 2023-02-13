public class VolOfPrism {
    public static void main(String[] args) {
        float h = 3f;
        float b1 = 1.2f;
        float b2 = 2.3f;
        float base = 0.5f * h * (b1 + b2);
        float H = 3.3f;
        float vol  = base * H;
        System.out.println("Volume of Prism = " + vol);
    }
}
