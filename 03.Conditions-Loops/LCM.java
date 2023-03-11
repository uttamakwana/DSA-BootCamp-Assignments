public class LCM {
    public static void main(String[] args) {
        int num1 = 12, num2 = 2, lcm;

        // maximum number between num1 and num2 is stored in lcm
        lcm = (num1 > num2) ? num1 : num2;

        // Always true
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.printf("The LCM of %d and %d is %d.", num1, num2, lcm);
                break;
            }
            ++lcm;
        }
    }
}
