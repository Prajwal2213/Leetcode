package patterns;

public class FloydsTriangle {
    public static void main(String[] args){
        int n= 5;
        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(++k + " ");
            }
            System.out.println();


        }
    }
}
//output:
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15