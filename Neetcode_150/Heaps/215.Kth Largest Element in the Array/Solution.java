/*
215. Kth largest Element in an Array
Pattern - Min Heap
Time complexity - O(N log k)
*/

class Solution {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int num: nums){
            pq.offer(num);
            if(pq.size() > k){
                pq.poll();
            }
        }
        
        return pq.peek();
    }
}