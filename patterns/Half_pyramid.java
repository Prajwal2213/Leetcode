package patterns;

public class Half_pyramid {
    public static void main(String[] args){
        int n= 6;
        for(int i=1;i<=n;i++){              // 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}

//output:
// *  1st row -> 1 Star
// ** 2nd row -> 2 Star
// ***  3rd row -> 3 Star             
// ****  4th row -> 4 Star
// *****  5th row -> 5 Star
// ******  6th row -> 6 Star