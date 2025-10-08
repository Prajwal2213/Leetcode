import java.util.*;

public class sumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sum1(1,n);
        System.out.println(res);
        sc.close();
    }

    static int sum1(int initial,int target){
        
        if(initial > target){
            return 0;
        }else{
            return initial + sum1(initial + 1, target);
        }

    }
}
