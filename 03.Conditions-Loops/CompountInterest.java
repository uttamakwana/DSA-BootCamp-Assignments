public class CompountInterest {
    public static void main(String[] args){
        double p = 2000f;
        double r = 2f;
        double n = 10f;
        double t = 2f;
        double amount = Math.pow(p * (1 + (r / n * 100)), n * t);
        System.out.printf("Final Amount = %-15.3f" , amount);
    }
}
