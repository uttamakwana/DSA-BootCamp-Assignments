import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int number = input.nextInt();
            int i = 1;
            while(i <= number){
                if(number % i == 0){
                    System.out.print(i + " ");
                }
                i++;
            }
        }
    }
}
