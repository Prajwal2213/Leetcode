import java.util.*;

public class printNtimes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of times values should be printed:");
        int n = sc.nextInt();
        recursion(n);
        sc.close();

    }

    static void recursion(int n){
        if(n == 0){
            return;
        }else{
            System.out.println("this is the value of " + n);
            recursion(n - 1);
        }
    }
}