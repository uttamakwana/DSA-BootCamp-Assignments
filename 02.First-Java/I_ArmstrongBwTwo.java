import java.util.Scanner;

public class I_ArmstrongBwTwo {
    // Program to give armstrong number between two numbers
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter two numbers : ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("Armstrong number between " + num1 + " and " + num2);
            for (int i = num1; i < num2; i++) {
                int number = i;
                int sum = 0 , rem = 0;
                while(number > 0){
                    rem = number % 10;
                    sum = sum + (rem * rem * rem);
                    number /= 10;
                }
                if(sum == i){
                    System.out.print(i + "\t");
                }
            }
        }
    }
}
