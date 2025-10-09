public class reverseArray{
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,6};
        int l = 0;
        int r = (arr.length - 1);

        while(l < r){
            swap(arr,l,r);
            l++;
            r--;

        }

        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    

    static void swap(int[] arr,int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}