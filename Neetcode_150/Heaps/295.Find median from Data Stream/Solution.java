/*
295.Find Median from Data Stream
*/

class MedianFinder {
    private PriorityQueue<Integer> lowHalf; //max-Heap
    private PriorityQueue<Integer> upHalf; //Min-Heap


    public MedianFinder() {
        lowHalf = new PriorityQueue<>(Collections.reverseOrder());
        upHalf = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
      if(lowHalf.isEmpty() || num <= lowHalf.peek()){
        lowHalf.offer(num);
      }else{
        upHalf.offer(num);
      }


      if(lowHalf.size() > upHalf.size() + 1){
        upHalf.offer(lowHalf.poll());
        
      }else if(upHalf.size() > lowHalf.size()){
        lowHalf.offer(upHalf.poll());
      
      }
    }
    
    public double findMedian() {
        if(lowHalf.size() > upHalf.size()){
            return lowHalf.peek();
        }

        return (lowHalf.peek() + upHalf.peek()) / 2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */