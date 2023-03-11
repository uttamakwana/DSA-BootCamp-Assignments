public class DiscountOfProduct{
    public static void main(String[] args){
        float price = 233f;
        float discount = 10f;
        float ans = price -  price * (discount / 100);
        System.out.println(ans);
    }
}