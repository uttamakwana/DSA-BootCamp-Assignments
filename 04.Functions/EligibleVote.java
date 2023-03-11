public class EligibleVote {
    public static void main(String[] args){
        int age = 20;
        check(age);
    }

    static void check(int age){
        if(age < 18){
            System.out.println("You are not eligible!");
        }
        else{
            System.out.println("You are eligible!");
        }
    }
}
