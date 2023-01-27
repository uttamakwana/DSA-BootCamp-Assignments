import java.util.Scanner;

public class G_Fibo {
    // Fibonacci Series Upto n numbers
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number till you want Fibonacci Series : ");
            int n = input.nextInt();
            int first = 0;
            int second = 1;
            int count = 2;
            int sum = 0;
            System.out.print("0\t1\t");
            while(count < n){
                sum = first + second;
                first = second;
                second = sum;
                count ++;
                System.out.print(sum + "\t");
            }
        }
        
    }
}
