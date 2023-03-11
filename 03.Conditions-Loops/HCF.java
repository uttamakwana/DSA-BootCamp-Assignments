import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {

        int num1, num2, hcf = 0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number : ");
            num1 = input.nextInt();
            System.out.print("Enter second number : ");
            num2 = input.nextInt();
        }
        for (int i = 1; i <= num1 || i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                hcf = i;
        }
        System.out.println("HCF of given two numbers is : " + hcf);

    }
}
