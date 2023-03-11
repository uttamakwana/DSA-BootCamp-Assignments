public class PowerInJava {
    public static void main(String[] args){
        int power = 5;
        int number = 3;
        int ans = 1;
        for(int i = 1; i <= power; i++){
            ans = ans * number;
        }
        System.out.println(number + " to power " + power + " = " + ans);
    }
}
