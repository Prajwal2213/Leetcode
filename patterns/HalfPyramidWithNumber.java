package patterns;

public class HalfPyramidWithNumber{
    public static void main(String[] args){
        int n=5;
       NumberPyramid(n);
       InvertedNumberPyramid(n);
    }

    static void NumberPyramid(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
        System.out.print("****************\n");
    }

    // output:
// 1
// 12
// 123
// 1234
//12345
    static void InvertedNumberPyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//output:
// 12345
// 1234
// 123
// 12
// 1

