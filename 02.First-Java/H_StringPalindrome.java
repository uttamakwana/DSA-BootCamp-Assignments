import java.util.Scanner;
public class H_StringPalindrome {
    // Program to check whetehr the String is Palindrome or not
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a String : ");
            String str = input.next().trim();
            int start = 0;
            int end = str.length() - 1;
            boolean flag = true;
            while(start < end){
                if(str.charAt(start) != str.charAt(end)){
                    flag = false;
                    break;
                }
                start++;
                end--;
            }
            if(!flag){
                System.out.println("Not a Palindrome");
            }
            else{
                System.out.println("Palindrome");
            }
        }
    }
}
