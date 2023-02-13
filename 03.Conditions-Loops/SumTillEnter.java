import java.util.Scanner;
public class SumTillEnter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter a number : ");
            int number = input.nextInt();
            if(number == 0){
                break;
            }
            sum = sum + number;
            System.out.println("The sum is = " + sum );
        }
        System.out.println("The final sum is = " + sum);
    }
}
