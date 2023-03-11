import java.util.Scanner;

public class PrimeBetweenTwo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter num1 : ");
            int num1 = input.nextInt();
            System.out.print("Enter num2 : ");
            int num2 = input.nextInt();
            prime(num1, num2);
        }
    }

    static void prime(int a, int b) {
        for (int i = (a + 1); i < b; i++) {
            boolean flag = false;
            int number = i;
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(number + " ");
            }
        }
    }
}
