public class EvenOrOdd {
    public static void main(String[] args) {
        int number = 11;
        evenOrOdd(number);
    }
    static void evenOrOdd(int n){
        if(n % 2 == 0){
            System.out.println("Even!");
        }
        else{
            System.out.println("Odd");
        }
    }
}
