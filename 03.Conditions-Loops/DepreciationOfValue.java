public class DepreciationOfValue {
    public static void main(String[] args){
        double t = 2;
        double r = 3;
        double v = 3;
        double depreciationValue = v * Math.pow((1 - r / 100), t);
        System.out.printf("The depreciation value = %-15.3f" , depreciationValue);
    }
}
