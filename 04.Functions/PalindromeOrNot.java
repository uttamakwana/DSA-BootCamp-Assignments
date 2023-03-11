import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int number = input.nextInt();
            palindrome(number);
        }
    }

    static void palindrome(int n){
        int sum = 0;
        int checkNumber = n;
        while(n > 0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        if(checkNumber == sum){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("Not a Palindrome!");
        }
    }
}
