public class ReverseString {
    public static void main(String[] args){
        String name = "Uttam";
        StringBuilder reverse = new StringBuilder();
        for (int i = name.length()-1 ; i >= 0; i--) {
            reverse.append(name.charAt(i));
        }
        System.out.println(reverse);
    }
}
