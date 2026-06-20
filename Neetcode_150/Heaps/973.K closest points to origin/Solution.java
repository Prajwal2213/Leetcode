/*
973. K closest points to origin

Time complexity - O(N log K)

*/

import java.util.*;

class Solution{
    //calculate the Squared Distance Value
    public int squareDis(int[] p){
        return (p[0] * p[0] + p[1] * p[1]);
    }

    public int[][] kClosest(int[][] points, int k){
        /* Java's PriorityQueue naturally builds a Min-Heap (smallest values on top).
 * It expects the comparator to return:
 * - Negative number: if the first item (a) is smaller than the second (b) -> keeps 'a' first.
 * - Positive number: if 'a' is larger than 'b' -> swaps them.
 * * By evaluating (distance(b) - distance(a)) 
 * - If 'b' is farther than 'a', it returns a POSITIVE number.
 * - This positive result tells Java that 'a' should be treated as "larger" 
 * and pushed down, effectively floating the farthest point ('b') to the top.
 * * RESULT: The point FARTHEST from the origin always sits at the root/top of the heap.
 */        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> squareDis(b) - squareDis(a));

        for(int[] p :points){
            maxHeap.offer(p);
            //if size is greater than k then remove the top value
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int[][] res = new int[k][2];

        for(int i = 0; i < k; i++){
            res[i] = maxHeap.poll();
        }

        return res;
    }
}