import java.util.Scanner;

public class Special {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int number;
            int sum = 0;
            while(true){
                System.out.print("Enter a number : ");
                number = input.nextInt();
                sum = sum + number;
                if(number == 0){
                    break;
                }
            }
            System.out.println("Sum = " + sum);
        }

    }
}
