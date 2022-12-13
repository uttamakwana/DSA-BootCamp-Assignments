import java.util.Scanner;

public class C_MulTable {
    public static void main(String[] args) {
        // Printing the multiplication table of input number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = in.nextInt();
        System.out.println("Multiplication table of " + number + " is below.");
        for(int i=1 ; i<=10; i++){
            System.out.println(number + " X " + i + " = " + (number * i));
        }
        // We can also use "while" loop for it.
    }
}
