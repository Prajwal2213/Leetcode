/*
621.Task Scheduler
*/


/* 
Pattern - Greedy and Counting / Math
Time complexity - O(N) N- tasks.length
*/

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int mx = 0, c = 0;
        int s = tasks.length;
        for(int i = 0; i < s; i++) freq[tasks[i] - 'A']++;
        for(int i = 0; i < 26; i++) if(freq[i] > mx) mx = freq[i];
        for(int i = 0; i < 26; i++) if(freq[i] == mx) c++;
        int ans = (mx - 1) * (n + 1) + c;
        return ans > s ? ans: s;
        
    }
}

/* 
Pattern - Greedy and Priority Queue(Max - Heap)
Time complexity - O(N log K) N- tasks.length
*/

class Solution {
  

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;


        //getting freq Count
        for(int i = 0; i< tasks.length; i++){
            freq[tasks[i] - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        //Storing the Freq in Max Heap for retrieval of highest freq element
        for(int i = 0; i< 26; i++){
            if(freq[i] > 0){
                pq.offer(freq[i]);
            }
        }

        int time = 0;


        while(!pq.isEmpty()){
            int cycle = n + 1;
            List<Integer> store = new ArrayList<>();//to store the updated freq and waiting to complete the current cycle
            int taskCount = 0;

            while(cycle-- > 0 && !pq.isEmpty()){
                int currentFreq = pq.poll();
                if (currentFreq > 1) {
                    store.add(currentFreq - 1);
                }
                taskCount++; //counting Number of task in each cycle
            }

            //updating the freq
            store.forEach(pq::offer);

            time += (pq.isEmpty() ? taskCount : n + 1);
        }

        return time;
    }
}



