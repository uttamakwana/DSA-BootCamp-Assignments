import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        prime(number);
    }

    static void prime(int n) {
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Prime");
        } else {

            System.out.println("Not Prime");
        }
    }
}
