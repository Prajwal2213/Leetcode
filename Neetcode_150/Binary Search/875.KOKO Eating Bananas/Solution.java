/*
875.KOKO Eating Bananas
Pattern - Binary Search
Time complexity - O(n log M) M = larg
Space complexity - O(1)
*/


class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int larg = Integer.MIN_VALUE;   
        //Largest Element in the Array
        //Largest Element is the maximum range , where koko can eat
        for(int num:piles){ //Time complexity - O(N)
            larg = Math.max(larg, num);
        }

        //perform Binary Search on the K value ranging from 1 - larg
        int left = 1;
        int right = larg;
        int ans = 0;
        while(left <= right){ 
            int mid = left + (right - left) / 2;
            int time_eat = time_taken(piles, mid);
            if(time_eat <= h){
                ans = mid; // storing the least possible K value
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }

    private int time_taken(int[] piles, int k){
        double req_hrs = 0;
        for(int num:piles){
            req_hrs += Math.ceil((double)num / k); //Type conversion is important (num/k) return int value 
        }

        return (int)req_hrs;
    }
}