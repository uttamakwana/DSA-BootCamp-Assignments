import java.util.Scanner;

public class A_LeapYear {
    public static void main(String[] args) {
        // To find a leap year or not
        // If all the year which are divisible by 4 will be leap year.
        // But here 1700, 1800, 1900 year are not leap year but thay are divisible by 4,
        // So we have changed the condition.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = in.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");

        }
    }
}
