import java.util.*;

class Primenumber{
    public static void main(String[] args) {
        int num = 4;
        boolean counter = true;

        if(num <= 1){
            counter = false;
        }else{
            for(int i=2;i * i <= num;i++){
                if(num % i == 0){
                    counter = false;
                    break;
                }
            }
        }
        
        if(counter){
            System.out.println("It is Prime Number");
            
        }else{
            System.out.println("It is not a Prime Number");
        }

    }
}