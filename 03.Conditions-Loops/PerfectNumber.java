public class PerfectNumber {
    public static void main(String[] args){
        int number = 128;
        int sum = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0 && i!=number){
                sum = sum + i;
            }
            if(sum > number){
                sum = 0;
            }
        }
        System.out.println(sum == number ? "Perfect Number" : "Not a Perfect Number");
    }
}
