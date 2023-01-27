import java.util.Scanner;

public class E_LargestOfTwo {
    // Print the largest of two numbers
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Two Numbers : ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int max = num1;
            if(num2 > num1){
                max = num2;
            }
            System.out.println("The largest of Two numbers is " + max);
        }
    }
}
