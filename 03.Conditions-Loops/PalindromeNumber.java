public class PalindromeNumber {
    public static void main(String[] args){
        int number = 123521;
        int reverse = 0;
        int checkNumber = number;
        while(number > 0){
            int rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }
        if(reverse == checkNumber){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
