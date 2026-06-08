/*
4.Median of Two Sorted Arrays
Time complexity - O(M + N)
Suggested Time complexity - O(log (M + N))
*/


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0 && nums2.length == 0) return 0.00;

        int i = 0, j = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        //compare and add the smallest value into ArrayList First
        while((i < nums1.length) && (j < nums2.length)){
            if(nums1[i] < nums2[j]){
                arr.add(nums1[i]);
                i++;
            }else{
                arr.add(nums2[j]);
                j++;
            }
        }

        //add remaining element in First Array
        while(i < nums1.length){
            arr.add(nums1[i]);
            i++;
        }

        //add remaining element in Second Array
        while(j < nums2.length){
            arr.add(nums2[j]);
            j++;
        }

        //calculate Median of Sorted Array
        //If length is odd return mid element
        double res = 0;
        if(arr.size() % 2 != 0){
            res = arr.get(arr.size()/2);
        }else{ // else calculate the median of middle two nnumbers 

            res = (arr.get(arr.size()/2) + arr.get((arr.size()/2) - 1))/2.0;
        }
        return res;
    }
}