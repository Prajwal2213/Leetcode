/*  Brute - force solution
 Time complexity - O(Sz) 
space Complexity - O(Sz)
Sz - Length of the Linked List
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt = 0;
        ListNode temp = head;
        
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
       if(cnt == n) return head.next;

       int pos = cnt - n;
       temp = head;
      int incnt = 0;

    while(temp != null && incnt < pos - 1){
        incnt++;
        temp = temp.next;
       }

       temp.next = temp.next.next;
       return head;     
}
}


// Two Pointer

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow  = head;

        for(int i = 0; i < n ;i++){
            fast = fast.next;
        }

        if(fast == null) return head.next;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
}
}