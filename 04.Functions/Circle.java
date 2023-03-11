import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter radius of circle : ");
            float r = input.nextFloat();
            areaAndCircumfearenceOfCircle(r);
        }
    }

    static void areaAndCircumfearenceOfCircle(float r){
        System.out.println("Area = " + (3.14f * r * r));
        System.out.println("Circumfearence = " + (2 * 3.14f * r));
    }
}
