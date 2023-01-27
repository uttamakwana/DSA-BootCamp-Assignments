import java.util.Scanner;

public class D_SimpleCalc {
    // Take a numbers and operators as an input and give an output
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a First Number : ");
            int num1 = input.nextInt();
            System.out.print("Enter a Second Number : ");
            int num2 = input.nextInt();
            System.out.print("Enter an Operator (+, -, *, / , % ): " );
            char choice = input.next().trim().charAt(0);

            if(choice == '+'){
                System.out.println("Sum = " + (num1 + num2));
            }
            else if(choice == '-'){
                System.out.println("Substraction = " + (num1 - num2));
            }
            else if(choice == '*'){
                System.out.println("Multiplication = " + (num1 * num2));
            }
            else if(choice == '/'){
                System.out.println("Dividation = " + (num1 / num2));
            }
            else if(choice == '%'){
                System.out.println("Modulation = " + (num1 % num2));
            }
            else {
                System.out.println("Invalid Operator");
            }
        }

    }
}
