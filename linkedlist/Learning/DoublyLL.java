class Node {
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLL{

    static Node head;
    public static Node add(Node head, int data){
        Node newNode  = new Node(data);
        if(head == null){
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    public static Node addFirst(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return head;
        }
        
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;    
    }

    public static Node deleteFirst(Node head){
        if(head == null) return head;
        head = head.next;
        head.prev = null;
        return head;
    }

    public static Node deleteLast(Node head){
        if(head == null || head.next == null) return head;

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next.prev = null;
        return head;
    }

    public static void Print(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        int val1,val2;
        Node head = new Node(10);
        DoublyLL list = new DoublyLL();
        head = list.add(head,36);
        head = list.add(head,40);
        head = list.add(head,20);
        head = list.addFirst(head, 96);
        head = list.deleteFirst(head);
        // System.out.println(val1);
        head = list.deleteLast(head);
        // System.out.println(val2);
        list.Print(head);
      
    }
}