import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your marks : ");
            int marks = input.nextInt();
            if (marks <= 100) {
                grades(marks);
            } else {
                System.out.println("Enter marks <= 100");
            }
        }
    }

    static void grades(int marks) {
        if (marks > 90) {
            System.out.println("Grade = AA");
        }
        else if(marks > 80 && marks <= 90){
            System.out.println("Grade = AB");
        }
        else if(marks > 70 && marks <= 80){
            System.out.println("Grade = BB");
        }
        else if(marks > 60 && marks <= 70){
            System.out.println("Grade = BC");
        }
        else if(marks > 50 && marks <= 60){
            System.out.println("Grade = CD");
        }
        else if(marks > 40 && marks <= 50){
            System.out.println("Grade = DD");
        }
        else{
            System.out.println("Fail");
        }
    }
}
