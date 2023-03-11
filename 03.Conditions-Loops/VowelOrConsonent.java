import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a letter : ");
            char ch = input.next().trim().charAt(0);
            if(ch == 97 || ch == 65 || ch == 69 || ch == 101 || ch == 73 || ch == 105 || ch == 79 || ch == 111 || ch == 85 || ch == 115){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonent");
            }
        }
    }
}
