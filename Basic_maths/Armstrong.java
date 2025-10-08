
public class Armstrong{
    public static void main(String[] args){
        int n = 543;
        int n1 = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0){
            int last_digit = n %10;
            sum += Math.pow(last_digit,digits);
            n = n/10;
        }

        if(sum == n1){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong NUmber");
        }
    }
}