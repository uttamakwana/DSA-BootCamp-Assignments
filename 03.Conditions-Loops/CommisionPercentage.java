public class CommisionPercentage {
    public static void main(String[] args) {
        double amount = 200000;
        double commisionRate = 2.5;
        double commision = amount * (commisionRate / 100);
        System.out.printf("The Paymet = %-15.3f", commision);
    }
}
