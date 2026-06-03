//84.Largest Rectangle in Histogram
//Pattern - Monotonic Increasing Stack
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
       int length = heights.length;
       int area = 0;

        for(int i = 0; i<length; i++){
            //Stack is  storing only the index
            //previous smallest element will be bottom of the stack
            //next smallest element will be the 'i'th index value
            //width formula = heights[bar] * (nse - pse - 1)
            //Add the element into the stack if it is greater than st.peek() value 
            while(!st.empty() && heights[i] < heights[st.peek()]){
                int bar = st.pop();
                int pse = st.empty() ? -1 : st.peek();
                int nse = i;
                area = Math.max(area, heights[bar] * (nse - pse - 1));
            }
            st.push(i);
        }

        //for the Remaining Element left inside the stack 
        while(!st.empty()){
            int bar = st.pop();
            int pse = st.empty() ? -1 : st.peek();
            int nse = length;
            area = Math.max(area, heights[bar] * (nse - pse - 1));
        }
        return area;
    }
}

//Time complexity - O(N)
//space Complexity - O(N)

