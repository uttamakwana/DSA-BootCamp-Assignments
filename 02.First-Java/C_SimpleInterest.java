import java.sql.Time;
import java.util.Scanner;

public class C_SimpleInterest {
    public static void main(String[] args) {
        // A program to find a Simple Interest
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        float p = input.nextFloat();
        System.out.print("Enter Rate : ");
        float r = input.nextFloat();
        System.out.print("Enter time : ");
        float t = input.nextFloat();
        float si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
        System.out.println("The Amount you need to pay after " + t + " year is " + (p + si)) ;

    }
}
