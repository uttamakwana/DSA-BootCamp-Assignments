import java.util.Scanner;

public class CGPA {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int semester = 8;
            float SPI;
            float sum = 0;
            for(int i = 1; i <= 8; i++){
                System.out.print("Enter your " + i + " semester SPI : " );
                SPI = input.nextFloat();
                sum = sum + SPI;
            }
            System.out.println("CGPA = " + (sum / semester));
        }
    }
}
