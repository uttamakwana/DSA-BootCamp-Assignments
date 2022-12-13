import java.util.Scanner;

public class B_SumOfTwo {
    public static void main(String[] args) {
        // Adding two numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : " );
        int num1 = in.nextInt();
        System.out.print("Enter second number : " );
        int num2 = in.nextInt();
        System.out.println("Sum of two numbers is : " + (num1 + num2));
    }
}
