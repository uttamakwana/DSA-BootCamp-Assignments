import java.net.SocketTimeoutException;
import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter how many numbers you want? : ");
            int n = input.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Enter number : ");
                int number = input.nextInt();
                sum = sum + number;
            }
            float avarage = (float)((float)sum / (float)n);
            System.out.println("The average is = " + avarage);
        }
    }
}
