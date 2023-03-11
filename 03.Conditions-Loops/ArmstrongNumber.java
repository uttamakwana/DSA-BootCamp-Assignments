public class ArmstrongNumber{
    public static void main(String[] args){
        int number = 153;
        int checkNumber = number;
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            sum = sum + (rem * rem * rem);
            number = number / 10;
        }
        if(checkNumber == sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not!");
        }
    }
}