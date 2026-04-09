import java.util.*;

public class LL_function {

    public static LinkedList<Integer> convertarr2list(int[] arr){
        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int i:arr){
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {10, 50, 98, 97};
        LinkedList<Integer> list = convertarr2list(arr);
        System.out.print(list);
        // list.addFirst(98);
        // list.addLast(97);

        // for(Integer i:list){
        //     System.out.print(i + "->");
        // }
        // System.out.println("null");
    }

   
}
