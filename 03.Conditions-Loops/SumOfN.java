import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int sum = 0;
            int n = 10;
            for(int i = 1; i <= n; i++){
                System.out.print("Enter number : ");
                int number = input.nextInt();
                sum = sum + number;
            }
            System.out.println("Sum = " + sum);
        }
    }
}
