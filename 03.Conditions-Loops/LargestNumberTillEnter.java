import java.util.Scanner;

public class LargestNumberTillEnter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        while(true){
            System.out.print("Enter a number : ");
            int number = input.nextInt();
            if(number > largest ){
                largest = number;
            }
            if(number == 0){
                break;
            }
            System.out.println("The largest number is = " + largest);
        }
       System.out.println("The final largest number is = " + largest);
    }
}
