import java.util.*;

public class printNtimes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of times values should be printed:");
        int n = sc.nextInt();
        recursion(1,n);
        sc.close();

    }

    static void recursion(int initial,int target){
    if(initial > target){
       return;
    }else{
        System.out.println(initial);
    recursion(initial + 1,target);
    }
    

    }
}