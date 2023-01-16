import java.util.Scanner;

public class D_SumTillX {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int sum = 0;
            while (true) {
                System.out.print("Enter a number : ");
                int number = input.nextInt();
                System.out.println("'x' to exit\n'c' for continue");
                char choice = input.next().charAt(0);
                sum = sum + number;
                if (choice == 'x' || choice == 'X') {
                    break;
                }
            }
            System.out.println("The sum is = " + sum);
        } catch (Exception e) {
            System.out.println("The error is " + e);
        }

    }
}
