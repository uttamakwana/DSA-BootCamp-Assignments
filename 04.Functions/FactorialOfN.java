import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int number = input.nextInt();
            factorial(number);
        }
    }

    static void factorial(int number){
        if(number <= 1){
            System.out.println("Factorial = 1");
        }
        else{
            int ans = 1;
            for(int i = 1; i <= number; i++){
                ans = ans * i;
            }
            System.out.println("Factorial = " + ans);
        }
    }
}
