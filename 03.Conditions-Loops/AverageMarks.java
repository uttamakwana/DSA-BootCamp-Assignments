import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 10;
        float sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.print("Enter your marks : ");
            Float marks = input.nextFloat();
            sum = sum + marks;
        }
        System.out.println("Average marks = " + (sum / n));
    }
}
