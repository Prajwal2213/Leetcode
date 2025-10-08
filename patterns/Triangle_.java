package patterns;

public class Triangle_{
    public static void main(String[] args) {
        float n = 9;
       for(int i = 0;i<=n;i++){
        for(int j = 1;j<=i;j++){
            System.out.print(" ");
        }
        for(int j = i+1 ;j<=n-i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}


// Example n = 9
/*
*********
 *******
  *****
   ***
    *
 */