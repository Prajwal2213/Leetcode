public class GCD {
    public static void main(String[] args) {
        int n1 = 48, n2= 180;
        int gcd = 0;
        int max = Math.max(n1,n2);
        for(int i=1;i<=max;i++){
            if(n1%i == 0 && n2%i==0){
                if(i > gcd){
                    gcd = i;
                }
            }
        }
        System.out.println(gcd);

    }
}
