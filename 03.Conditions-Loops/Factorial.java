public class Factorial {
    public static void main(String[] args) {
        int n = 0;
        int ans = 1;
        if (n == 0 || n == 1) {
            ans = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                ans = ans * i;
            }
        }
        System.out.println("The factorial of " + n + " = " + ans);
    }
}