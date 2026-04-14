



//Using HashMap

class Solution {
    public Node copyRandomList(Node head) {
       if(head == null) return null;

    //Create a HashMap
       HashMap<Node, Node> oldToNew = new HashMap<>();

       Node curr = head;
    //Create a new Node and Store it in Hashmap
       while(curr != null){
        oldToNew.put(curr,new Node(curr.val));
        curr = curr.next;
       }

       curr = head;
    //Access the Random and next pointer from the old Linkedlist
       while(curr != null){
        oldToNew.get(curr).next = oldToNew.get(curr.next);
        oldToNew.get(curr).random  =  oldToNew.get(curr.random);
        curr = curr.next;
       }

       return oldToNew.get(head);
    }
}

//Using Interweave Method
public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        Node curr = head;
        while (curr != null) {
            Node new_node = new Node(curr.val, curr.next);
            curr.next = new_node;
            curr = new_node.next;
        }
        
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next != null ? curr.next.next : null;
        }
        
        Node old_head = head;
        Node new_head = head.next;
        Node curr_old = old_head;
        Node curr_new = new_head;
        
        while (curr_old != null) {
            curr_old.next = curr_old.next.next;
            curr_new.next = curr_new.next != null ? curr_new.next.next : null;
            curr_old = curr_old.next;
            curr_new = curr_new.next;
        }
        
        return new_head;
    }
}