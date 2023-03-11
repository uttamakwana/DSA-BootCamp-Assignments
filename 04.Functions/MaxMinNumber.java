public class MaxMinNumber {
    public static void main(String[] args){
        int num1 = 3;
        int num2 = 5;
        int num3 = 23;
        max(num1, num2, num3);
        min(num1, num2, num3);
    }

    static void max(int a, int b, int c){
        int max = a;
        if(b > a && b > c){
            max = b;
        }
        else if(c > a && c > b){
            max = c;
        }
        System.out.println("Max = " + max);
    }
    static void min(int a, int b, int c){
        int min = a;
        if(b < a && b < c){
            min = b;
        }
        else if(c < a && c < b){
            min = c;
        }
        System.out.println("Min = " + min);
    }
}
