import java.util.Scanner;

public class SumTillNumber{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number till you want sum : ");
            int number = input.nextInt();
            sumTillN(number);
        }
    }

    static void sumTillN(int n){
        int sum = 0;
        for(int i = 0; i <= n ; i++){
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}