public class SubOfPdtSum {
    public static void main(String[] args) {
        int in = 64;
        int ans = ((in%10) * (in/10 % 10)) - ((in%10) +(in/10 % 10));
        System.out.println("Subtraction of Product and Sum of Digits of an Integer = " + ans);
    }
}
