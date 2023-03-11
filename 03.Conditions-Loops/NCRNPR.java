public class NCRNPR {
    public static void main(String[] args){
        int n = 5;
        int r = 3;
        int nFac = 1;
        int rFac = 1;
        int n_rFac = 1;
        for(int i = 1; i <= n; i++){
            nFac = nFac * i;
        }
        for(int i = 1; i <= (n-r); i++){
            n_rFac = n_rFac * i;
        }
        for(int i = 1; i <= r; i++){
            rFac = rFac * i;
        }
        int nPr = nFac / n_rFac;
        int nCr = nFac / (n_rFac * rFac);
        System.out.println("nPr = " + nPr);
        System.out.println("nCr = " + nCr);
    }
}
