import java.util.Scanner;

public class A_EvenOrOdd {
    public static void main(String[] args) {
        // Program to check whether number is Even Or Odd
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int number = input.nextInt();
            if(number % 2 == 0){
                System.out.println("Number is Even!");
            }
            else{
                System.out.println("Number is Odd!");
            }
        }
    }
}
