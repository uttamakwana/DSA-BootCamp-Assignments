public class SumOfDigitsOfNumber {
    public static void main(String[] args){
        int number = 23443;
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
