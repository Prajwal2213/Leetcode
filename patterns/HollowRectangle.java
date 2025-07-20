package patterns;

public class HollowRectangle {
    static int r = 4;    //variables are instance of the class.(static should be used to access them without creating an instance)
    static int c = 5;
    public static void main(String[] args){
        for(int i=1;i <= r;i++){
            for(int j=1;j <= c;j++){
                if(i == 1 || i==r || j==1 || j==c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    
}

//output:
// *****
// *   *
// *   *
// *****