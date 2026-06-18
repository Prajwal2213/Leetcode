/*
Pattern - Max Heap
Time Complexity - O(N log N)
space Complexity - O(N)
*/

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> fw = new PriorityQueue<>((a, b) -> (b-a));

        for(int num : stones){
            fw.offer(num);
        }

        while(fw.size() > 1){
            int x = fw.poll();
            int y = fw.poll();

            if(x != y) fw.offer(x-y);
        }

        return fw.isEmpty() ? 0 : fw.poll();
    }
}