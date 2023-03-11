public class DistanceBetweenTwoPoints {
    public static void main(String[] args){
        double x1 = 2;
        double x2 = 4;
        double y1 = 3;
        double y2 = 1;
        double a = x2 - x1;
        double b = y2 - y1;
        double ans = (a * a) + (b * b);
        double distance = Math.sqrt(ans);
        System.out.printf("Distance between two points = %-15.3f" , distance);
    }
}
