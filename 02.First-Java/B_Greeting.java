import java.util.Scanner;

public class B_Greeting {
    public static void main(String[] args) {
        // Gretting to an input name
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Hello "+ name + "!");
    }
}
