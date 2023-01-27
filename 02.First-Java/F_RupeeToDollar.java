import java.util.Scanner;

public class F_RupeeToDollar {
    // Convert rupees to U.S. Dollar
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter money in Rupees : ");
            double r = input.nextInt();
            double d = (r * (0.012));
            System.out.println("The U.S Dollar for " + r + " rupees is " + " = " + d) ;

        }
    }
}
