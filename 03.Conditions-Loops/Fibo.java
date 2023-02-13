public class Fibo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 2;
        int n = 15;
        int sum = 0;
        System.out.print("0 1 ");
        while(count < n){
            sum = a + b;
            a = b; 
            b = sum;
            System.out.print(sum + " ");
            count++;
        }
    }
}
