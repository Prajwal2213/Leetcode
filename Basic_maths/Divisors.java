import java.util.*;
public class Divisors{
    public static void main(String[] args){
          long startTime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int input  = sc.nextInt();
        List<Integer> div = new ArrayList<>();
        for(int i=1;i<Math.sqrt(input);i++){
            if(input % i == 0){
                div.add(i);
                if(input/i != i){
                    div.add(input/i);
                }
            }
        }
        Collections.sort(div);
        System.out.print(div);
        long endTime = System.currentTimeMillis(); // end time in milliseconds
        long runtime = endTime - startTime;

        System.out.print("\n" + runtime);
    }
}