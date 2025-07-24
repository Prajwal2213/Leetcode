package Searching;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array:");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = i + 1; 
        }
        System.out.println("Enter the element to Search:");
        int num = sc.nextInt();
        int flag = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                System.out.println("The element is Found at index: " + i);
                flag = 1;
                
            }
        }
        if (flag == 0)  System.out.println("The element is not Found ");
        
            
    

        sc.close();
    }
}